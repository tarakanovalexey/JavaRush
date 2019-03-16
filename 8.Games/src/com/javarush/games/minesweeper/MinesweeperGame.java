package com.javarush.games.minesweeper;

import com.javarush.engine.cell.*;
import java.util.ArrayList;
import java.util.List;

public class MinesweeperGame extends Game {
    private static final int SIDE = 50;
    private int countClosedTiles = SIDE * SIDE, score = 0;
    private static final String MINE = "\uD83D\uDCA3";
    private static final String FLAG = "\uD83D\uDEA9";
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private int countMinesOnField = 0, countFlags = 0;
    private boolean isGameStopped;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        super.initialize();
    }

    private void createGame() {
        for (int i = 0; i < SIDE; i++)
            for (int j = 0; j < SIDE; j++) {
                setCellValue(j, i, "");
                gameField[i][j] = new GameObject(j, i, getRandomNumber(10) == 0);
                if (gameField[i][j].isMine)
                    countMinesOnField++;
                setCellColor(j, i, Color.LIGHTGREY);
            }
        countMineNeighbors();
        countFlags = countMinesOnField;
    }

    private void countMineNeighbors() {
        List<GameObject> list = new ArrayList<>();
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (!gameField[j][i].isMine) {
                    list = getNeighbors(gameField[j][i]);
                    for (GameObject object : list)
                        if (object.isMine) {
                            gameField[j][i].countMineNeighbors++;
                        }
                }
            }
        }
    }

    private List getNeighbors(GameObject gameObject) {
        int x = gameObject.x;
        int y = gameObject.y;
        List<GameObject> list = new ArrayList<>();
        for (int i = x - 1; i < x + 2; i++)
            for (int j = y - 1; j < y + 2; j++)
                if (!(i < 0 || j < 0 || i > (SIDE - 1) || j > (SIDE - 1) || (i == x && j == y))) {
                    list.add(gameField[j][i]);
                }
        return list;
    }

    private void openTile(int x, int y) {
        if (!gameField[y][x].isOpen && !isGameStopped && !gameField[y][x].isFlag) {
            gameField[y][x].isOpen = true;
            countClosedTiles--;
            if (gameField[y][x].isMine) {
                setCellValueEx(x, y, Color.RED, MINE);
                gameOver();
            } else {
                if (gameField[y][x].countMineNeighbors != 0) {
                    setCellNumber(x, y, gameField[y][x].countMineNeighbors);
                    setCellColor(x, y, Color.GREENYELLOW);
                } else {
                    setCellValue(x, y, "");
                    setCellColor(x, y, Color.TEAL);
                    List<GameObject> list = getNeighbors(gameField[y][x]);
                    for (GameObject each : list)
                        if (!each.isOpen)
                            openTile(each.x, each.y);
                }
                score += 5;
                setScore(score);
                if (countClosedTiles == countMinesOnField)
                    win();
            }
        }
    }

    private void markTile(int x, int y) {
        if (!gameField[y][x].isOpen && !isGameStopped) {
            if (gameField[y][x].isFlag) {
                gameField[y][x].isFlag = false;
                countFlags++;
                setCellColor(x, y, Color.LIGHTGRAY);
                setCellValue(x, y, "");
            } else if (countFlags != 0) {
                gameField[y][x].isFlag = true;
                countFlags--;
                setCellColor(x, y, Color.FORESTGREEN);
                setCellValue(x, y, FLAG);
                }
            }
        }



    @Override
    public void onMouseLeftClick(int x, int y) {
        if (!isGameStopped)
        openTile(x, y);
        else restart();
        super.onMouseLeftClick(x, y);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        markTile(x, y);
        super.onMouseRightClick(x, y);
    }

    private void gameOver(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "GAME OVER!", Color.BLUEVIOLET, 40);
    }

    private void win(){
        isGameStopped = true;
        showMessageDialog(Color.BLACK, "YOU WIN!", Color.BLUEVIOLET, 40);
    }

    private void restart(){
        isGameStopped = false;
        score = 0;
        setScore(0);
        countClosedTiles = SIDE * SIDE;
        countMinesOnField = 0;
        createGame();
    }
}
