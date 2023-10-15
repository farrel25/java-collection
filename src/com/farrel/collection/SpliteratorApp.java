package com.farrel.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> names = List.of("Farrel", "Athaillah", "Putra", "Elraf", "Halliahta", "Artup");

        Spliterator<String> spliteratorNames1 = names.spliterator();
        Spliterator<String> spliteratorNames2 = spliteratorNames1.trySplit();
        Spliterator<String> spliteratorNames3 = spliteratorNames2.trySplit();





        System.out.println("\n==== SPLITERATOR 1 ====");
        System.out.println(spliteratorNames1.estimateSize());

        // Anonymous class version
//        spliteratorNames1.forEachRemaining(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // lambda version
//        spliteratorNames1.forEachRemaining(s -> System.out.println(s));

        // method reference version
        spliteratorNames1.forEachRemaining(System.out::println);





        System.out.println("\n==== SPLITERATOR 2 ====");
        System.out.println(spliteratorNames2.estimateSize());
        spliteratorNames2.forEachRemaining(System.out::println);





        System.out.println("\n==== SPLITERATOR 3 ====");
        System.out.println(spliteratorNames3.estimateSize());
        spliteratorNames3.forEachRemaining(System.out::println);
    }
}
