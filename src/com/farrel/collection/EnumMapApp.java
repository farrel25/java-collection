package com.farrel.collection;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class EnumMapApp {

    public enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> enumMap = new EnumMap<>(Level.class);

        enumMap.put(Level.FREE, "Farrel");
        enumMap.put(Level.STANDARD, "Athaillah");
        enumMap.put(Level.PREMIUM, "Putra");

        for (Map.Entry<Level, String> entrySet : enumMap.entrySet()) {
            System.out.println(entrySet.getKey() + ": " + entrySet.getValue());
        }
    }
}
