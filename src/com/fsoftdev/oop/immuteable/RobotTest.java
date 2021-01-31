package com.fsoftdev.oop.immuteable;

import java.util.HashMap;
import java.util.Map;

public class RobotTest {
    public static void main(String[] args) {
        Map<String,String> specMap=new HashMap<>();
        specMap.put("1","1.Spec");
        specMap.put("2","2.Spec");
        specMap.put("3","3.Spec");
        Robot robot=new Robot("Android",1000, specMap);
        System.out.println(robot.getName());
        System.out.println(robot.getPower());
        System.out.println(robot.getSpecs());

        // robot.power=123;

        specMap.put("4","4.Spec");
        System.out.println(robot.getSpecs());

        specMap.put("5","5.Spec");
        System.out.println(robot.getSpecs());


    }
}
