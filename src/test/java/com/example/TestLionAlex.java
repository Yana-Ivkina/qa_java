package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestLionAlex {
    LionAlex lionAlex = new LionAlex();

    public TestLionAlex() throws Exception {
    }

    @Test
    public void testGetKittens() {
        assertEquals(lionAlex.getKittens(), 0);
    }

    @Test
    public void testListFriend() {
        assertEquals(lionAlex.getFriends(), List.of("Марти", "Глория", "Мелман"));
    }

    @Test
    public void testPlaceLife() {
        assertEquals(lionAlex.getPlaceOfLiving(), "Нью-Йоркский зоопарк");
    }
}
