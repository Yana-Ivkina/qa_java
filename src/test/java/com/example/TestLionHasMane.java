package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLionHasMane {
    private final String genderLion;
    private final boolean hasMane;
    Feline feline = Mockito.mock(Feline.class);

    public TestLionHasMane(String genderLion, boolean hasMane) {
        this.genderLion = genderLion;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getGenderLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testHasMane() throws Exception {
        Lion lion = new Lion(genderLion, feline);
        assertEquals(lion.doesHaveMane(), hasMane);
    }
}
