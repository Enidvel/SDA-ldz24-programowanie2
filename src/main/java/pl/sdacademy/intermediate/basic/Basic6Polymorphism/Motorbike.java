package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Motorbike implements Vehicle{
    private static final int MAX_SPEED = 300;
    private static final int OFFSET = 30;
    private int speed = 0;

    public Motorbike() {
    }

    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed += OFFSET;
        } else {
            System.out.println("Motorbike has reached maximum speed of " + MAX_SPEED + " km/h");
        }
}

    @Override
    public int getSpeed() {
        return speed;
    }
}
