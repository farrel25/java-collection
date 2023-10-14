package com.farrel.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> nameStack = new Stack<>();

        nameStack.push("Farrel");
        nameStack.push("Athaillah");
        nameStack.push("Putra");

        while (true) {
            try {
                String next = nameStack.pop();
                System.out.println(next);

            } catch (EmptyStackException e) {
                break;
            }
        }
    }
}
