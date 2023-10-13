package com.farrel.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {

    public static void main(String[] args) {

        System.out.println("\n==== STACK ====");
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Farrel");
        stack.offerLast("Athaillah");
        stack.offerLast("Putra");



        System.out.println("\n==== DATA ====");
        System.out.println("Size: " + stack.size());

        for (String name : stack) {
            System.out.println(name);
        }



        System.out.println("\n==== POLLING ====");
        System.out.println("Size: " + stack.size());

        for (String next = stack.pollLast(); next != null; next = stack.pollLast()) {
            System.out.println(next);
        }

        System.out.println("Size: " + stack.size());





        System.out.println("\n\n\n==== QUEUE ====");
        Deque<String> queue = new LinkedList<>();

        queue.offerLast("Farrel");
        queue.offerLast("Athaillah");
        queue.offerLast("Putra");



        System.out.println("\n==== DATA ====");
        System.out.println("Size: " + queue.size());

        for (String name : queue) {
            System.out.println(name);
        }



        System.out.println("\n==== POLLING ====");
        System.out.println("Size: " + queue.size());

        for (String next = queue.pollFirst(); next != null; next = queue.pollFirst()) {
            System.out.println(next);
        }

        System.out.println("Size: " + queue.size());
    }
}
