package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes y){
        if (y != null) {
            if (y.equals(BMP)) return new BmpReader();
            else if (y.equals(JPG)) return new JpgReader();
            else return new PngReader(); }
            throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
