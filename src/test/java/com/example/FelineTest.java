package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int actual;
    private final int expected;

    public FelineTest(int actual, int expected) {
        this.actual = actual;
        this.expected = expected;
    }
    //Параметры указаны на случай, если появится много однотипных тестов на целые значения
    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] { {2, 2} };
    }

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
    //Проверяем, что метод getKittens с аргументом возвращает значение аргумента
    @Test
    public void checkMakeCountOfKittens() {
        Feline feline = new Feline();
        feline.getKittens(actual);
        assertEquals(expected, actual);
    }

}