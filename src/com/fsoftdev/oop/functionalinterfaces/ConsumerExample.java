package com.fsoftdev.oop.functionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

    public static void main(String[] args) {

        // Consumer
        // Take an argument and  return nothing
        Consumer<Integer> integerConsumer = (Integer number) -> System.out.println(number*11);
        integerConsumer.accept(100);

    }
}


