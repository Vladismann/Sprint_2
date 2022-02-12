package com.example;

import java.util.List;

public class Alex extends Lion {

    //Алекс всегда "Самец" по умолчанию
    private static final String sex = "Самец";

    public Alex(Feline feline) throws Exception {
        //В super всегда передаем что Алекс - "Самец"
        super(sex, feline);
    }

    //Список друзей Алекса
    public List<String> getFriends() { return List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"); }
    //Место обитания Алекса
    public String getPlaceOfLiving() { return "Нью-Йоркский зоопарк"; }
    //У Алекса нет детенышей
    @Override
    public int getKittens() { return 0; }

}
