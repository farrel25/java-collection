package com.farrel.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        //List<String> names = new LinkedList<>();

        names.add("Farrel");
        names.add("Athaillah");

        names.set(0, "Budi");

        names.remove(1);

        System.out.println(names.get(0));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
