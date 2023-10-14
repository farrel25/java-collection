package com.farrel.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        System.out.println("\n==== SORTED MAP ====");
        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("Farrel", "Farrel");
        sortedMap.put("Athaillah", "Athaillah");
        sortedMap.put("Putra", "Putra");

        for (String key : sortedMap.keySet()) {
            System.out.println(key);
        }





        System.out.println("\n==== SORTED MAP WITH CUSTOM COMPARATOR ====");

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

        SortedMap<String, String> sortedMapDesc = new TreeMap<>(stringDescComparator);

        sortedMapDesc.put("Farrel", "Farrel");
        sortedMapDesc.put("Athaillah", "Athaillah");
        sortedMapDesc.put("Putra", "Putra");

        for (String key : sortedMapDesc.keySet()) {
            System.out.println(key);
        }





        System.out.println("\n==== IMMUTABLE SORTED MAP ====");

        SortedMap<String, String> emptySortedMap = Collections.emptySortedMap();
        SortedMap<String, String> unmodifiableSortedMapDesc = Collections.unmodifiableSortedMap(sortedMapDesc);

        // unmodifiableSortedMapDesc.put("Elraf", "Elraf"); // ERROR
    }
}
