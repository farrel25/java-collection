package com.farrel.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Farrel", "Athaillah", "Putra", "Elraf", "Halliahta", "Artup"));
        System.out.println("original: " + names);

        Collections.reverse(names);
        System.out.println("reverse: " + names);

        Collections.shuffle(names);
        System.out.println("shuffle: " + names);
    }
}
