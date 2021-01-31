package com.fsoftdev.oop.functionalinterfaces;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = () ->{
            System.out.println("functional interface is implemented with lambda");
        };

        functionalInterface.execute();


        //UnaryOperator
        // Take a specific type and return same type
        // We can use change state of aken object
        UnaryOperator<Person> personUnaryOperator = (Person person) -> {
            person.setName("John Doe");
            return person;
        };
        System.out.println(personUnaryOperator.apply(new Person()));


    }
}


