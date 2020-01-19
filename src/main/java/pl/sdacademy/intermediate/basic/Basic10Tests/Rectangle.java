package pl.sdacademy.intermediate.basic.Basic10Tests;

public class Rectangle {

//    int getOne() {
//        return 1;
//    }

    int width;
    int height;

    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width or height is lower than 0");
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    void updateWidth(int newWidth) {
        if (newWidth >= 0) {
            this.width = newWidth;
        }

    }

    void updateHeight(int newHeight) {
        if (newHeight >= 0) {
            this.height = newHeight;
        }
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * width + 2 * height;
    }


}
