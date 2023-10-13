package com.farrel.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {
        Map<Integer, Integer> weakHashMap = new WeakHashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            weakHashMap.put(i, i);
        }

        System.gc();
        System.out.println(weakHashMap.size());



        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++) {
            hashMap.put(i, i);
        }

        System.gc();
        System.out.println(hashMap.size());
    }
}
