package com.farrel.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1 == key2);
        System.out.println(key1.equals(key2));



        Map<String, String> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(key1, "Farrel");
        identityHashMap.put(key2, "Farrel");

        System.out.println(identityHashMap.size());



        Map<String, String> hashMap = new HashMap<>();

        hashMap.put(key1, "Farrel");
        hashMap.put(key2, "Farrel");

        System.out.println(hashMap.size());
    }
}
