package com.fsoftdev.oop.inheritance;

public class Robot {

    public int power;
    public int model;
    public int effect=1;


    public Robot(int power, int model) {
        this.power = power;
        this.model = model;
    }

    public void firePower(int bullet) {
        effect=bullet*power;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "power=" + power +
                ", model=" + model +
                ", effect=" + effect +
                '}';
    }
}
