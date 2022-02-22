package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    //Проверяем, что семейство кошачьих дергает метод хищника при работе метода eatMeat
    @Test
    public void checkIsPredator() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }
    //Проверяем название семейства
    @Test
    public void checkFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }
    //Проверяем, что метод getKittens без аргументов возвращает значение
    @Test
    public void checkGetKittens() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

}