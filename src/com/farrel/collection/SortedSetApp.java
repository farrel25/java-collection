package com.farrel.collection;

import com.farrel.collection.data.Person;
import com.farrel.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

    public static void main(String[] args) {
        // Let's assume that Person Class is an outside class / from the library that we used.
        // and the Person class doesn't implement Comparable interface,
        // but I want to sort the set of person object by name property.
        // therefore, I need to create the implementation of Comparator interface for the Person class

        // if the class doesn't implement Comparable interface,
        // and I'm not specifying the comparator inside the constructor parameter when I instantiate TreeSet object,
        // then it will throw ClassCastException.

        // ERROR
        // SortedSet<Person> people = new TreeSet<>();

        // ASCENDING
        // SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        // DESCENDING
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Farrel"));
        people.add(new Person("Athaillah"));
        people.add(new Person("Putra"));

        for (Person person : people) {
            System.out.println(person.getName());
        }





        // IMMUTABLE SORTEDSET
        SortedSet<Person> peopleUnmodifiable = Collections.unmodifiableSortedSet(people);
        // peopleUnmodifiable.add(new Person("Elraf")); // ERROR

    }
}
