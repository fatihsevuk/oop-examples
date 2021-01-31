package com.fsoftdev.oop.functionalinterfaces;

public class RunnableExample {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Run methods works");
        runnable.run();
    }
}
