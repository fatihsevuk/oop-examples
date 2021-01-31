package com.fsoftdev.oop.anonymusclass;

public class Main {
    public static void main(String[] args) {
        Age age= new Age() {
            @Override
            public void getAge() {
                System.out.println("Age is "+x);
            }
        };
        age.getAge();

        ///////////////////////////////////////////////////////
        Thread thread= new Thread(() -> System.out.println("Child Thread"));

        thread.start();
        System.out.println("main Thread");


        ////////////////////////////////////////////////////////////

        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Child1 Thread");
            }
        };


        Thread thread1=new Thread(runnable);
        thread1.start();
        System.out.println("Main Thread");

        ///////////////////////////////////////////////////////////


        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child2 Thread");
            }
        });



    }
}
