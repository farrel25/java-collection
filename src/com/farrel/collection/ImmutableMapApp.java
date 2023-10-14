package com.farrel.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> emptyMap = Collections.emptyMap();
        Map<String, String> singletonMap = Collections.singletonMap("name", "Farrel");

        HashMap<String, String> mutable = new HashMap<>();
        mutable.put("name", "Farrel");
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutable);

        Map<String, String> immutableMap = Map.of(
                "first", "Farrel",
                "middle", "Athaillah",
                "last", "Putra"
        );
        // immutableMap.put("a", "a"); // ERROR
    }
}
