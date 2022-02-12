package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    //Проверяем, что семейство кошачьих дергает метод хищника при работе метода eatMeat
    @Test
    public void checkIsPredator() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(actual, expected);
    }
    //Проверяем название семейства
    @Test
    public void checkFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }
    //Проверяем, что метод getKittens без аргументов возвращает значение
    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

}