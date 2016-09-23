package com.example.artem.homework.model;

/**
 * Created by Artem on 17.09.2016.
 */
public class Person {
    private String mName;

    public Person(String mName) {
        this.mName = mName;
    }

    public Person() {
    }

    public String getmName() {
        return mName;
    }

    public Person setmName(String mName) {
        this.mName = mName;
        return this;
    }
}
