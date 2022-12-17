package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestFeline {
    Feline feline = new Feline();
    @Mock
    Feline felineMock;

    @Test
    public void testEatMeat() throws Exception {
        assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void testGetKittens() {
        felineMock.getKittens(5);
        Mockito.verify(felineMock).getKittens(5);
    }

    @Test
    public void testGetFamily() {
        assertEquals(feline.getFamily(), "Кошачьи");
    }

    @Test
    public void testGetKitten() {
        assertEquals(feline.getKittens(), 1);
    }
}
