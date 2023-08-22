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
    daysofWeek.add("Monday");
    daysofWeek.add("Tuesday");
    daysofWeek.add("Wednesday");
    daysofWeek.add("Thursday");
    daysofWeek.add("Friday");
    daysofWeek.add("Saturday");
    daysofWeek.add("Sunday");

    System.out.println("Days of the Week list");
    for (String day : daysofWeek2)
    {
        System.out.println(day);
    }


}

}
