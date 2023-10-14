package com.farrel.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("name.first", "Farrel");
        hashMap.put("name.middle", "Athaillah");
        hashMap.put("name.last", "Putra");

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
