package com.fsoftdev.oop.functionalinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        // BinaryOperator
        // Take two parameter return one
        // input and output parameter must be same data type
        BinaryOperator<Integer> binaryOperatorAdd = (num1,num2) -> num1+num2;
        BinaryOperator<Integer> binaryOperatorSub = (num1,num2) -> num1-num2;
        System.out.println(binaryOperatorAdd.apply(11,33));
        System.out.println(binaryOperatorSub.apply(11,33));

    }
}


