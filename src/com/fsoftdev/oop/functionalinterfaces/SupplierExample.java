package com.fsoftdev.oop.functionalinterfaces;

import java.util.Date;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // Supplier
        // Take no argument and  return a value
        Supplier<String> stringSupplier = () -> "Hello from supplier";
        System.out.println(stringSupplier.get());

    }
}


