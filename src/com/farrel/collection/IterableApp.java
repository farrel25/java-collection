package com.farrel.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Farrel", "Athaillah", "Putra");

        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\nITERATOR");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
        }
    }
}