package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {

    private final String genderLion;
    private final boolean hasMane;
    Feline feline = Mockito.mock(Feline.class);

    @Parameterized.Parameters
    public static Object[][] getGenderLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    public TestLion(String genderLion, boolean hasMane) {
        this.genderLion = genderLion;
        this.hasMane = hasMane;
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(lion.getKittens(), 1);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(lion.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void testHasMane() throws Exception {
        Lion lion = new Lion(genderLion);
        assertEquals(lion.doesHaveMane(), hasMane);
    }
}
