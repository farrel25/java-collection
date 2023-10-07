package com.farrel.collection.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public List<String> getHobbies() {
        //return hobbies; // mutable
        return Collections.unmodifiableList(hobbies); // immutable
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }
}
