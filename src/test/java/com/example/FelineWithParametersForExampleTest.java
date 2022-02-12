package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

//Класс содержащий параметризацию создан для примера параметризации
@RunWith(Parameterized.class)
public class FelineWithParametersForExampleTest {

    private final int value;
    private final int expected;

    public FelineWithParametersForExampleTest(int value, int expected) {
        this.value = value;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][] {
                {0, 0},
                {2, 2}
        };
    }

    //Проверяем, что метод getKittens с аргументом возвращает значение аргумента
    @Test
    public void checkMakeCountOfKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(value);
        assertEquals(expected, actual);
    }

}