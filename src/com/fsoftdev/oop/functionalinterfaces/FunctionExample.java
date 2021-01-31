package com.fsoftdev.oop.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionExample {

    public static void main(String[] args) {
        // Built-in Functional interfaces
        // Function
        // take a single parameter, return a single parameter
        Function<Integer,Integer> ageFunction = (Integer yearOfBirth) -> 2021-yearOfBirth;
        System.out.println(ageFunction.apply(1991));
    }
}


