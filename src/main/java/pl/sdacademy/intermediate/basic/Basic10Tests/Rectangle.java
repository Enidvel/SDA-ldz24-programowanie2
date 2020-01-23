package pl.sdacademy.intermediate.basic.Basic10Tests;

public class Rectangle {

//    int getOne() {
//        return 1;
//    }

    int width;
    int height;

    Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width or height is lower than 0");
        } else {
            this.width = width;
            this.height = height;
        }
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void updateWidth(int newWidth) { // a'la setter
        if (newWidth >= 0) {
            this.width = newWidth;
        }

    }

    void updateHeight(int newHeight) {
        if (newHeight >= 0) {
            this.height = newHeight;
        }
    }

    int calculateArea() { // UWAGA: nie przekazujemy tutaj parametrów, bo chcemy by metoda operowała na wartościach obiektu
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * width + 2 * height;
    }


}
