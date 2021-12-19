package ru.mirea.labs1516.task1;

public class Robot {
    private Thread leftLeg = new Thread(new Leg("LEFT", this));
    private Thread rightLeg = new Thread(new Leg("RIGHT", this));

    public void step() {
        leftLeg.start();
        rightLeg.start();
    }
}
