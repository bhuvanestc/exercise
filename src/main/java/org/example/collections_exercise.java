package org.example;
import java.util.ArrayList;
import java.util.List;


public class collections_exercise {
    public static void main(String[] args)
{
    /* ex:1*/
    System.out.println("ex:1");
    List <String> daysofWeek = new ArrayList<> ();
    daysofWeek.add("Monday");
    daysofWeek.add("Tuesday");
    daysofWeek.add("Wednesday");
    daysofWeek.add("Thursday");
    daysofWeek.add("Friday");
    daysofWeek.add("Saturday");
    daysofWeek.add("Sunday");

    System.out.println("Days of the Week list");
    System.out.println(daysofWeek);


    /*ex:2*/
    System.out.println("ex:2");
    List <String> daysofWeek2 = new ArrayList<> ();
    daysofWeek2.add("Monday");
    daysofWeek2.add("Tuesday");
    daysofWeek2.add("Wednesday");
    daysofWeek2.add("Thursday");
    daysofWeek2.add("Friday");
    daysofWeek2.add("Saturday");
    daysofWeek2.add("Sunday");

    System.out.println("Days of the Week list");
    for (String day : daysofWeek2)
    {
        System.out.println(day);
    }

    /*ex:3*/
    System.out.println("ex:3");
    List <String> daysofWeek3 = new ArrayList<> ();
    daysofWeek3.add("Monday");
    daysofWeek3.add("Tuesday");
    daysofWeek3.add("Wednesday");
    daysofWeek3.add("Friday");
    daysofWeek3.add("Saturday");
    daysofWeek3.add("Sunday");

    System.out.println(daysofWeek3);
    daysofWeek3.add(3,"Thursday");
    System.out.println("Days of the Week list");
    for (String day : daysofWeek3)
    {
        System.out.println(day);
    }
    /*ex:4*/
    System.out.println("ex:4");
    List <String> daysofWeek4 = new ArrayList<> ();
    daysofWeek4.add("Monday");
    daysofWeek4.add("Tuesday");
    daysofWeek4.add("Wednesday");
    daysofWeek4.add("Thursday");
    daysofWeek4.add("Friday");
    daysofWeek4.add("Saturday");
    daysofWeek4.add("Sunday");

    System.out.println(daysofWeek4);
    List<String> sublist = daysofWeek4.subList(0,3);
    System.out.println("The sublist is " );
    for (String day:sublist)
    {
        System.out.println(day);
    }










}

}
