package com.example.artem.homework;

import com.example.artem.homework.model.Person;

import java.util.ArrayList;

/**
 * Created by Artem on 22.09.2016.
 */
public class Config {
    private static final String[] PERSON = {
            "Михаил Булгаков","Михаил Булгаков","Эрнест Хемингуей","Эрнест Хемингуей",
            "Энтони Берджес","Джорж Оруэлл","Михаил Шолохов",
            "Джорж Мартин","Братья Стругацкие","Братья Стругацкие",
            "Антон Чехов","Антон Чехов", "J R R Tolkien","J R R Tolkien","J R R Tolkien"};

    public static ArrayList getPerson() {
        ArrayList<Person> arrayList = new ArrayList();
        for(int i = 0; i < PERSON.length; i++)
        {
            arrayList.add(new Person().setmName(PERSON[i]));
        }
        return arrayList;
    }
}
