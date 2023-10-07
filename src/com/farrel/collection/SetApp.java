package com.farrel.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {

        System.out.println("\n==== HASHSET ====");

        Set<String> names = new HashSet<>();
        names.add("Farrel");
        names.add("Athaillah");
        names.add("Putra");

        names.add("Farrel");
        names.add("Athaillah");
        names.add("Putra");

        for (String name : names) {
            System.out.println(name);
        }





        System.out.println("\n==== LINKEDHASHSET ====");

        Set<String> namesLinked = new LinkedHashSet<>();
        namesLinked.add("Farrel");
        namesLinked.add("Athaillah");
        namesLinked.add("Putra");

        namesLinked.add("Farrel");
        namesLinked.add("Athaillah");
        namesLinked.add("Putra");

        for (String name : namesLinked) {
            System.out.println(name);
        }
    }
}
