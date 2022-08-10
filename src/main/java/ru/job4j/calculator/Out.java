package ru.job4j.calculator;

import java.time.LocalDate;

public class Out {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea += " But I am a newbie. ";
        int year = LocalDate.now().getYear();
        idea += year;
        System.out.println(idea);
    }
}
