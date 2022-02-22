package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    //Проверяем какой звук издает кошка
    @Test
    public void soundCheck() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }
    //Проверяем, что кошка дергает метод семейства кошачьих/хищников при работе метода getFood
    @Test
    public void checkIsPredator() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

}