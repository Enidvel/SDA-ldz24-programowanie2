package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Rocket implements Vehicle {
    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private static final int OFFSET = 10000;
    private int speed = 0;

    public Rocket() {
    }

    @Override
    public void accelerate() {
        if (speed + OFFSET <= MAX_SPEED) {
            speed += OFFSET;
        } else {
            System.out.println("Rocket has reached maximum speed of " + MAX_SPEED + " km/h");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
