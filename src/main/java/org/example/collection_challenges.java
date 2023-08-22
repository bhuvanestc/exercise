package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class collection_challenges {
    public static void main(String[] args) {
        ex1();
    }
    public static void ex1() {

        

        System.out.println("ex:1");
        Set<String> daysofWeek = new TreeSet<>();
        daysofWeek.add("Monday");
        daysofWeek.add("Tuesday");
        daysofWeek.add("Wednesday");
        daysofWeek.add("Thursday");
        daysofWeek.add("Friday");
        daysofWeek.add("Saturday");
        daysofWeek.add("Sunday");

        Set<String> weekends= new TreeSet<>();
        weekends.add("Saturday");
        weekends.add("Sunday");
        Set<String> commondays = new TreeSet<>(daysofWeek);
        commondays.retainAll(weekends);
        System.out.println("Common days are:");
        for (String day: commondays) {
            System.out.println(day);
        }

    }

}
