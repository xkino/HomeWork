package com.company.task2;

public class Mouse {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("speed  не может быть меньше или равно 0");
        }
        this.speed = speed;
    }

    public Mouse(int speed) {
        setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                '}';
    }
}
