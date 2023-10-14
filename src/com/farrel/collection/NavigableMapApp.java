package com.farrel.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        System.out.println("\n==== NAVIGABLE MAP ====");
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("farrel", "Farrel");
        navigableMap.put("athaillah", "Athaillah");
        navigableMap.put("putra", "Putra");

        for (String key : navigableMap.keySet()) {
            System.out.println(key);
        }





        System.out.println("\n==== NAVIGABLE MAP KEY ====");
        System.out.println("Lower Key of \"farrel\" : " + navigableMap.lowerKey("farrel"));
        System.out.println("Higher Key of \"farrel\" : " + navigableMap.higherKey("farrel"));
        System.out.println("Floor Key of \"rafael\" : " + navigableMap.floorKey("rafael"));
        System.out.println("Ceiling Key of \"rafael\" : " + navigableMap.ceilingKey("rafael"));





        System.out.println("\n==== REVERSED NAVIGABLE MAP ====");
        NavigableMap<String, String> navigableMapReversed = navigableMap.descendingMap();

        for (String key : navigableMapReversed.keySet()) {
            System.out.println(key);
        }





        System.out.println("\n==== IMMUTABLE NAVIGABLE MAP ====");
        NavigableMap<Object, Object> emptyNavigableMap = Collections.emptyNavigableMap();
        NavigableMap<String, String> unmodifiableNavigableMapReversed = Collections.unmodifiableNavigableMap(navigableMapReversed);

        // unmodifiableNavigableMapReversed.put("elraf", "Elraf"); // ERROR
    }
}
