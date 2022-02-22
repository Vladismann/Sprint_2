package com.example;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AnimalTest {

    private Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    //Проверяем, чем питается хищник
    @Test
    public void checkIsPredator() throws Exception {
        List<String> actual = animal.getFood("Хищник");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
    //Проверяем, чем питается травоядное
    @Test
    public void checkIsHerbivore() throws Exception {
        List<String> actual = animal.getFood("Травоядное");
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, actual);
    }
    //Проверяем, что метод getFood выбрасывает исключение, если вид неопределен и его текст корректен
    @Test
    public void checkIsUnknownSpecies() {
        Exception exception = null;
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        try { animal.getFood("Неизвестный вид"); }
        catch (Exception ex) { exception = ex; }

        assertNotNull(exception);
        assertEquals(exception.getMessage(), expected);
    }
    //Проверяем сообщение семействах животных
    @Test
    public void getFamily() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}