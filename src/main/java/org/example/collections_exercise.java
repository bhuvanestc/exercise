package org.example;
import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class collections_exercise {
    public static void main(String[] args) {

        ex8();




    }


    public static void ex1() {


        System.out.println("ex:1");
        List<String> daysofWeek = new ArrayList<>();
        daysofWeek.add("Monday");
        daysofWeek.add("Tuesday");
        daysofWeek.add("Wednesday");
        daysofWeek.add("Thursday");
        daysofWeek.add("Friday");
        daysofWeek.add("Saturday");
        daysofWeek.add("Sunday");

        System.out.println("Days of the Week list");
        System.out.println(daysofWeek);
    }


    public static void ex2() {
        System.out.println("ex:2");
        List<String> daysofWeek2 = new ArrayList<>();
        daysofWeek2.add("Monday");
        daysofWeek2.add("Tuesday");
        daysofWeek2.add("Wednesday");
        daysofWeek2.add("Thursday");
        daysofWeek2.add("Friday");
        daysofWeek2.add("Saturday");
        daysofWeek2.add("Sunday");

        System.out.println("Days of the Week list");
        for (String day : daysofWeek2) {
            System.out.println(day);
        }
    }

    public static void ex3() {
        System.out.println("ex:3");
        List<String> daysofWeek3 = new ArrayList<>();
        daysofWeek3.add("Monday");
        daysofWeek3.add("Tuesday");
        daysofWeek3.add("Wednesday");
        daysofWeek3.add("Friday");
        daysofWeek3.add("Saturday");
        daysofWeek3.add("Sunday");

        System.out.println(daysofWeek3);
        daysofWeek3.add(3, "Thursday");
        System.out.println("Days of the Week list");
        for (
                String day : daysofWeek3) {
            System.out.println(day);
        }
    }

    public static void ex4() {
        System.out.println("ex:4");
        List<String> daysofWeek4 = new ArrayList<>();
        daysofWeek4.add("Monday");
        daysofWeek4.add("Tuesday");
        daysofWeek4.add("Wednesday");
        daysofWeek4.add("Thursday");
        daysofWeek4.add("Friday");
        daysofWeek4.add("Saturday");
        daysofWeek4.add("Sunday");

        System.out.println(daysofWeek4);
        List<String> sublist = daysofWeek4.subList(0, 3);
        System.out.println("The sublist is ");
        for (String day : sublist) {
            System.out.println(day);
        }
    }
    public static void ex5() {
        System.out.println("ex:5");
        HashSet<String> daysofWeek5= new HashSet<>();
        daysofWeek5.add("Monday");
        daysofWeek5.add("Tuesday");
        daysofWeek5.add("Wednesday");
        daysofWeek5.add("Thursday");
        daysofWeek5.add("Friday");
        daysofWeek5.add("Saturday");
        daysofWeek5.add("Sunday");
        System.out.println(daysofWeek5);
        List<String> sortedList = new ArrayList<>(daysofWeek5);

        Collections.sort(sortedList);
        Set<String> sortedDaysOfWeek = new HashSet<>(sortedList);

        System.out.println("Sorted Days of the Week:");
        for (String day : sortedDaysOfWeek) {
            System.out.println(day);
        }


    }

    public static void ex6() {
        System.out.println("ex:6");
        Set<String> daysofWeekSet= new HashSet<>();

        daysofWeekSet.add("Monday");
        daysofWeekSet.add("Tuesday");
        daysofWeekSet.add("Wednesday");
        daysofWeekSet.add("Thursday");
        daysofWeekSet.add("Friday");
        daysofWeekSet.add("Saturday");
        daysofWeekSet.add("Sunday");
        List <String> daysofWeekList = new ArrayList<> (daysofWeekSet);
        Collections.sort(daysofWeekList);

        System.out.println("Days of the Week list");
        for (String day : daysofWeekList)

        {
            System.out.println(day);
        }

    }
    public static void ex7()
    {
        System.out.println("ex:7");

        HashSet<String> randomnames= new HashSet<>();
        randomnames.add("Bob");
        randomnames.add("David");
        randomnames.add("Anna");
        randomnames.add("Carlberg");

        System.out.println(randomnames);
        List<String> sortedList = new ArrayList<>(randomnames);

        Collections.sort(sortedList);

        System.out.println("Sorted names");
        for (String name: sortedList) {
            System.out.println(name);
        }

    }
    public static void ex8()
    {

        HashSet<String> randomnames= new HashSet<>();
        randomnames.add("Bob");
        randomnames.add("David");
        randomnames.add("Anna");
        randomnames.add("Carlberg");

        System.out.println(randomnames);
        Set<String> sortednames= new TreeSet<>(randomnames);


        System.out.println("Sorted names");
        for (String name: sortednames) {
            System.out.println(name);
        }

    }


}
