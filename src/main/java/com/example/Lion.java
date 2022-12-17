package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Fertility fertility;
    Predator predator;

    public Lion(Feline feline) {
        this.fertility = feline;
        this.predator = feline;
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    public int getKittens() throws Exception {
        return fertility.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
