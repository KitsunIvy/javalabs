package ru.mirea.labs1516.task1;

public class Leg implements Runnable {
    private String leg;
    Robot robot;

    public Leg(String leg, Robot robot) {
        this.leg = leg;
        this.robot = robot;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (robot) {
                System.out.println(leg);
            }
        }
    }
}
