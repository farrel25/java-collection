package com.farrel.collection;

import java.util.*;

public class NavigableSetApp {

    public static void main(String[] args) {

        System.out.println("\n==== NAVIGABLESET ====");
        // NavigableSet<String> names = new TreeSet<>();
        // names.addAll(Set.of("Farrel", "Athaillah", "Putra", "Elraf", "Halliahta", "Artup"));

        NavigableSet<String> names = new TreeSet<>(
                Set.of("Farrel", "Athaillah", "Putra", "Elraf", "Halliahta", "Artup")
        );

        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\n==== HEADSET ====");
        NavigableSet<String> headSet = names.headSet("Farrel", true);

        for (String name : headSet) {
            System.out.println(name);
        }





        System.out.println("\n==== TAILSET ====");
        NavigableSet<String> tailSet = names.tailSet("Farrel", true);

        for (String name : tailSet) {
            System.out.println(name);
        }





        System.out.println("\n==== REVERSING ====");
        NavigableSet<String> namesReversed = names.descendingSet();

        for (String name : namesReversed) {
            System.out.println(name);
        }





        System.out.println("\n==== IMMUTABLE NAVIGABLE SET ====");
        NavigableSet<String> unmodifiableNavigableSet = Collections.unmodifiableNavigableSet(names);
        // unmodifiableNavigableSet.add("Oops"); // ERROR
    }
}
