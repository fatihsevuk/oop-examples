package com.fsoftdev.oop.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

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


