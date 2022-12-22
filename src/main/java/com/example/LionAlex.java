package com.example;

import java.util.List;

public class LionAlex extends Lion {

    private static final Feline feline = new Feline();

    public LionAlex() throws Exception {
        super("Самец", feline);
    }

    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}
