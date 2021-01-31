package com.fsoftdev.oop.inheritance;

public class RobotTest {
    public static void main(String[] args) {
        AndroRobot android=new AndroRobot(3,100,true);
        android.firePower(300);
        System.out.println(android.toString());
    }

    // Notes

    // Java siniflarinda multiple inheritance yoktur
    // Her sinifin yanlizca bir parenti vardir fakr her parentin birden fazla cocugu olabilir.
    // Ust sinifin tum uyeleri alt sinifa miras gecer constructor haric cunku constructor uye degildir
    // Constructor alt sinifdan cagrilabilir.
    // Alt sinif ust sinifin privat alanlarini devralmnaz fakat getter setter ile erisebilir.
    // Interfacelerde multiple inheritance vardir
    // Object sinifi disinda tum siniflarin bir ust sinifi vardir
    // Her sinif temelde Object sinifinin cocugudur.


}
