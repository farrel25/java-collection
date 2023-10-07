package com.farrel.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {

    public static void main(String[] args) {
        List<String> singletonList = Collections.singletonList("One");
        List<String> emptyList = Collections.emptyList();

        ArrayList<String> mutableList = new ArrayList<>();
        mutableList.add("Farrel");
        mutableList.add("Athaillah");
        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

        List<String> immutableList = List.of("Farrel", "Athaillah", "Putra");
    }
}
