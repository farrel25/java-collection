package com.farrel.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(
                List.of("Farrel", "Athaillah", "Putra", "Elraf", "Halliahta", "Artup")
        );

        System.out.println("\n==== NOT SORTED ====");
        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\n==== SORTED ====");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\n==== SORTED WITH CUSTOM COMPARATOR ====");

        // implementation with common anonymous class
//        Comparator<String> stringDescComparator = new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        };

        // implementation using lambda
//        Comparator<String> stringDescComparator = (o1, o2) -> o2.compareTo(o1);

        // using reverse order method from Comparator
        Comparator<String> stringDescComparator = Comparator.reverseOrder();

        // using sort method from Collections
//        Collections.sort(names, stringDescComparator);

        // using sort method from List
        names.sort(stringDescComparator);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
