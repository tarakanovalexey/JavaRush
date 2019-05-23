package com.javarush.task.task25.task2515;


import static java.lang.Math.max;

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        isAlive = true;
    }

    public void die(){
        isAlive = false;
    }

    public boolean isIntersect(BaseObject o){
        double distance = Math.pow( Math.pow(x - o.x, 2) + Math.pow(y - o.y, 2), 0.5 );
        if (distance < max(radius, o.radius))
            return true;
        else return false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void move(){

    }

    public void draw(){

    }
}
