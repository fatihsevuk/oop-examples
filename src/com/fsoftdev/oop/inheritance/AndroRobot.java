package com.fsoftdev.oop.inheritance;

public class AndroRobot extends Robot {

    public boolean flyable;

    public AndroRobot(int power, int model,boolean flyable) {
        super(power, model);
        this.flyable=flyable;
    }

    public void setFlyable(boolean flyable) {
        this.flyable = flyable;
    }

    @Override
    public String toString() {
        return "AndroRobot{" +
                "flyable=" + flyable +
                ", power=" + power +
                ", model=" + model +
                ", effect=" + effect +
                '}';
    }



}
