package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Bicycle implements Vehicle{
    private static final int MAX_SPEED = 50;
    private static final int OFFSET = 5; // zwiększenie prędkości o 5
    private int speed = 0;

    public Bicycle() {
    }

    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed += OFFSET;
        } else {
            System.out.println("Bicycle has reached maximum speed of " + MAX_SPEED + " km/h");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
