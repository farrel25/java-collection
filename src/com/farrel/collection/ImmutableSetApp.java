package com.farrel.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

    public static void main(String[] args) {

        Set<String> emptySet = Collections.emptySet();
        Set<String> singletonSet = Collections.singleton("Farrel");

        HashSet<String> mutableSet = new HashSet<>();
        mutableSet.add("Farrel");
        mutableSet.add("Athaillah");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(mutableSet);

        Set<String> immutableSet = Set.of("Farrel", "Athaillah", "Putra");
    }
}
