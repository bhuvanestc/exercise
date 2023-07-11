package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.*;
import java.time.temporal.ChronoField;

public class TimeExercise {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("today : " + today);
        LocalDateTime dTF = LocalDateTime.now();
        DateTimeFormatter dTForm = DateTimeFormatter.ofPattern("EEEE dd MMM ");
        String formattedDate = dTF.format(dTForm);
        System.out.println(formattedDate);
        LocalDate lastMonday= LocalDate.of(2023, 07, 03);
        System.out.println("lastMonday = " + lastMonday);
        LocalDate lastSunday= LocalDate.of(2023, 07, 10);
        for (LocalDate date = lastMonday; date.isBefore(lastSunday); date = date.plusDays(1))
        {
            System.out.println(date);
        }




    }
}
