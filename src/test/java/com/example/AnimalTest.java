package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    //Проверяем, чем питается хищник
    @Test
    public void checkIsPredator() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Хищник");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
    //Проверяем, чем питается травоядное
    @Test
    public void checkIsHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood("Травоядное");
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, actual);
    }
    //Проверяем, что метод getFood обрабатывает исключения и выводит заложенное в него сообщение
    @Test
    public void checkIsUnknownSpecies() {
        Animal animal = new Animal();
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        try { animal.getFood("Неизвестный вид"); }
        catch (Exception ex) { assertEquals(ex.getMessage(), expected);}
    }
    //Проверяем сообщение семействах животных
    @Test
    public void getFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}