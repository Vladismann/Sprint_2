package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    //Проверяем, что метод getKittens возвращает значение указанное в классе кошачьих
    @Test
    public void checkGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }
    //Проверяем, что у самки не может быть гривы
    @Test
    public void checkIfDoesNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actual = lion.doesHaveMane();
        assertFalse(actual);
    }
    //Проверяем, что у самца есть грива
    @Test
    public void checkIfHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }
    //Проверяем, что конструктор выбрасывает исключение, если пол неопределен и его текст корректен
    @Test
    public void checkIfLionAsexualThrowsException() {
        Exception exception = null;
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        try { new Lion("Бесполый", feline); }
        catch (Exception ex) { exception = ex; }

        assertNotNull(exception);
        assertEquals(exception.getMessage(), expected);
    }
    //Проверяем, что лев дергает метод семейства кошачьих/хищников при работе метода getFood
    @Test
    public void checkIsPredator() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
        }

    }