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
public class AlexTest {

    private Alex alex;

    @Before
    public void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Mock
    Feline feline;

    //Проверяем, что полученный список друзей всегда соответсвует шаблоно в expected
    @Test
    public void checkWhoFriends() {
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        assertEquals(expected, actual);
    }
    //Проверяем место жительства Алекса
    @Test
    public void checkPlaceOfLiving() {
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }
    //Проверяем, что у Алекса есть грива
    @Test
    public void checkIsHaveMane() {
        boolean actual = alex.doesHaveMane();
        assertTrue(actual);
    }
    //Проверяем, что Алекс дергает метод семейства кошачьих/хищников при работе метода getFood
    @Test
    public void checkIsPredator() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = alex.getFood();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
    //Проверяем, что у Алекса нет детенышей
    @Test
    public void getKittens() {
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }

}