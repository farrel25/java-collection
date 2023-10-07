package com.farrel.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {

        System.out.println("\n==== ALL OF ====");

        Set<Gender> genders1 = EnumSet.allOf(Gender.class);

        for (Gender gender : genders1) {
            System.out.println(gender);
        }





        System.out.println("\n==== OF ====");

        Set<Gender> genders2 = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (Gender gender : genders2) {
            System.out.println(gender);
        }





        System.out.println("\n==== VALUES ====");

        Gender[] genders3 = Gender.values();

        for (Gender gender : genders3) {
            System.out.println(gender);
        }
    }
}
