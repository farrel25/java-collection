package com.farrel.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {

        System.out.println("\n==== ARRAYDEQUE ====");
        // Queue<String> arrayDeque = new ArrayDeque<>();
        Queue<String> arrayDeque = new ArrayDeque<>(10);

        System.out.println("\n==== 1st Queue (ArrayDeque) ====");
        // although I insert the data more than the initial capacity.
        // It will still work. It's because the behaviour of ArrayDeque is just like ArrayList.
        // it will grow the capacity when the amount of data reach the current capacity.
        for (int i = 0; i < 20; i++) arrayDeque.offer(String.valueOf(i));

        System.out.println("Size: " + arrayDeque.size());

        for (String next = arrayDeque.poll(); next != null; next = arrayDeque.poll()) {
            System.out.println(next);
        }

        System.out.println("Size: " + arrayDeque.size());



        System.out.println("\n==== 2nd Queue (ArrayDeque) ====");
        arrayDeque.offer("Farrel");
        arrayDeque.offer("Athaillah");
        arrayDeque.offer("Putra");

        System.out.println("Size: " + arrayDeque.size());

        for (String next = arrayDeque.poll(); next != null; next = arrayDeque.poll()) {
            System.out.println(next);
        }

        System.out.println("Size: " + arrayDeque.size());





        System.out.println("\n\n\n==== PRIORITYQUEUE ====");
        Queue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("Farrel");
        priorityQueue.offer("Athaillah");
        priorityQueue.offer("Putra");

        System.out.println("Size: " + priorityQueue.size());

        for (String next = priorityQueue.poll(); next != null; next = priorityQueue.poll()) {
            System.out.println(next);
        }

        System.out.println("Size: " + priorityQueue.size());





        System.out.println("\n\n\n==== LINKEDLIST ====");
        Queue<String> linkedList = new LinkedList<>();

        linkedList.offer("Farrel");
        linkedList.offer("Athaillah");
        linkedList.offer("Putra");

        System.out.println("Size: " + linkedList.size());

        for (String next = linkedList.poll(); next != null; next = linkedList.poll()) {
            System.out.println(next);
        }

        System.out.println("Size: " + linkedList.size());
    }
}
