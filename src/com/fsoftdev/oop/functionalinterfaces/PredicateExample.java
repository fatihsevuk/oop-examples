package com.fsoftdev.oop.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class PredicateExample {

    public static void main(String[] args) {

        //Predicate
        //Take a single value , return true or false
        Predicate<Integer> isAdultPredicate = (Integer age) -> age >= 18 ? true : false;
        System.out.println(isAdultPredicate.test(14)==true? "Adult" : "Not Adult");
        System.out.println(isAdultPredicate.test(18)==true? "Adult" : "Not Adult");
    }
}


