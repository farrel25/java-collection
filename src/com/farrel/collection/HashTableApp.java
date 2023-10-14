package com.farrel.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> hashtable = new Hashtable<>();

        hashtable.put("name.first", "Farrel");
        hashtable.put("name.middle", "Athaillah");
        hashtable.put("name.last", "Putra");

        for (String key : hashtable.keySet()) {
            System.out.println(key);
        }
    }
}
