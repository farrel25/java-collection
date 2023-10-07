package com.farrel.collection;

import com.farrel.collection.data.Person;

import java.util.List;

public class MutableApp {

    public static void main(String[] args) {

        Person farrel = new Person("Farrel");
        farrel.addHobby("Gaming");
        farrel.addHobby("Coding");

        doSomethingWithHobbies(farrel.getHobbies());

        for (String hobby : farrel.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Not Hobby");
    }
}
