package com.farrel.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("farrel", "Farrel");
        map.put("athaillah", "Athaillah");
        map.put("putra", "Putra");

        // anonymous class version
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String key, String value) {
//                System.out.println("key " + key + ": " + value);
//            }
//        });

        // lambda version
        map.forEach((key, value) -> System.out.println("key " + key + ": " + value));
    }
}
