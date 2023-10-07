package com.farrel.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();

        System.out.println("\n==== ADD ====");
        names.add("Farrel");
        names.add("Athaillah");
        names.add("Putra");
        names.addAll(List.of("Elraf", "Halliahta", "Artup"));

        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\n==== REMOVE ====");

        names.remove("Farrel");
        names.removeAll(List.of("Halliahta", "Artup"));

        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\n==== CONTAINS ====");

        System.out.println(names.contains("Athaillah"));
        System.out.println(names.containsAll(List.of("Putra", "Elraf")));
        System.out.println(names.containsAll(List.of("Farrel", "Elraf")));
    }
}
