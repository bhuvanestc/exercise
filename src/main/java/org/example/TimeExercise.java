package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.*;
import java.time.temporal.ChronoField;

public class TimeExercise {
    public static void main(String[] args) {
        /* ex:1*/
        LocalDate today = LocalDate.now();
        System.out.println("today : " + today);
        /* ex:2*/
        LocalDateTime dTF = LocalDateTime.now();
        DateTimeFormatter dTForm = DateTimeFormatter.ofPattern("EEEE dd MMM ");
        String formattedDate = dTF.format(dTForm);
        System.out.println(formattedDate);
        /* ex:3*/
        LocalDate lastMonday= LocalDate.of(2023, 07, 03);
        System.out.println("lastMonday = " + lastMonday);
        LocalDate lastSunday= LocalDate.of(2023, 07, 10);
        for (LocalDate date = lastMonday; date.isBefore(lastSunday); date = date.plusDays(1))
        {
            System.out.println(date);
        }

        /* ex:4*/
        LocalDate str = LocalDate.parse("2023-07-12");
        System.out.println("LocalDate : " + str);

        /* ex:5*/
        LocalDate givenDate= LocalDate.of(1945, 05, 8);
        DayOfWeek dayOfWeek = DayOfWeek.from(givenDate);
        System.out.println("dayOfWeek = " + dayOfWeek);




    }
}
