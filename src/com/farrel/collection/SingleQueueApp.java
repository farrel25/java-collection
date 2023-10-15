package com.farrel.collection;

import com.farrel.collection.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Farrel"));
        System.out.println(queue.offer("Athaillah"));
        System.out.println(queue.offer("Putra"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());
    }
}
