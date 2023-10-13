package com.farrel.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("first", "Farrel");
        linkedHashMap.put("middle", "Athaillah");
        linkedHashMap.put("last", "Putra");

        Set<String> keySetLinkedHashMap = linkedHashMap.keySet();

        for (String key : keySetLinkedHashMap) {
            System.out.println(key);
        }



        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("first", "Farrel");
        hashMap.put("middle", "Athaillah");
        hashMap.put("last", "Putra");

        Set<String> keySetHashMap = hashMap.keySet();

        for (String key : keySetHashMap) {
            System.out.println(key);
        }
    }
}
