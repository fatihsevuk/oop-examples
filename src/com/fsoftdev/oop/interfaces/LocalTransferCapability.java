package com.fsoftdev.oop.interfaces;

public interface LocalTransferCapability {

    void makeLocalTrasfer(double amount);

    default void makeTasnfer(double amount){
        makeLocalTrasfer(amount+amount*0.01);
    }

    static double calculateTax(double amount) {
        return amount*0.01;
    }





}
