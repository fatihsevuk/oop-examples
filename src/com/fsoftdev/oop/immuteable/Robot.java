package com.fsoftdev.oop.immuteable;

import java.util.HashMap;
import java.util.Map;

public final class Robot {

    private final String name;
    private final int power;
    private final Map<String, String> specs;



    public Robot(String name, int power, Map<String, String> specs) {
        this.name = name;
        this.power = power;
        Map<String,String> map=new HashMap<>();

        for (Map.Entry<String,String> entry : specs.entrySet()) {
            map.put(entry.getKey(),entry.getValue());
        }
        this.specs=map;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }


    public Map<String, String> getSpecs() {

        Map<String,String> map= new HashMap<>();
        for (Map.Entry<String,String> entry : this.specs.entrySet()) {
            map.put(entry.getKey(),entry.getValue());
        }
        return map;

    }
}


// Immuteable Class
// Sinif final olmalidir
// fieldlar final ve private  olmali
// Constructor icerisinde veri tasiyan list map gibi yapilar deep copy ile initialiye edilmelidir.
// Getter metodlari icersinde de deep copy donulmeli yani gercek nesne referansi donulecegine o fieldin bir kopyasi donulmeli
// Setter metodlari kesinlikle olmamali

