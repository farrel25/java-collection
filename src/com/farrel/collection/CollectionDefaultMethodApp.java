package com.farrel.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionDefaultMethodApp {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);





        // anonymous class version
//        numbers.replaceAll(new UnaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * 10;
//            }
//        });

        // lambda version
        numbers.replaceAll(integer -> integer * 10);

        System.out.println(numbers);






        // common for loop
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }

        // anonymous class version
//        numbers.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

        // lambda version
//        numbers.forEach(integer -> System.out.println(integer));

        // method reference version
        numbers.forEach(System.out::println);





        // anonymous class version
//        numbers.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 500;
//            }
//        });

        // lambda version
        numbers.removeIf(integer -> integer > 500);

        System.out.println(numbers);

    }
}
