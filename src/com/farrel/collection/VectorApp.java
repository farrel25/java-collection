package com.farrel.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> vector = new Vector<>();

        vector.add("Farrel");
        vector.add("Athaillah");
        vector.add("Putra");

        for (String name : vector) {
            System.out.println(name);
        }
    }
}
