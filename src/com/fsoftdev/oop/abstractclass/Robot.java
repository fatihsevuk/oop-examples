package com.fsoftdev.oop.abstractclass;

 abstract class Robot {

    // cannot be instantiated
    // but can be subclassed
    // if they have one or more abstract medhod, it must be declared abstract
    // they can declare abstract and concrete method
    // A subclass derived from an abstract class must be implement all the bas class's abstract method or be abstract itself

    abstract void move();

    void fire(){
        System.out.println("Base Robot is fire....");
    }


    // When we use abstract class
    // for design partially an API
    // Birden cok alt sinifin paylasacagi ortak oyellikleri bir yerde capsullemk icin
     //

}
