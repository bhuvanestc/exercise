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
        System.out.println("\n");
        /* ex:2*/
        LocalDateTime dTF = LocalDateTime.now();
        DateTimeFormatter dTForm = DateTimeFormatter.ofPattern("EEEE dd MMM ");
        String formattedDate = dTF.format(dTForm);
        System.out.println(formattedDate);
        System.out.println("\n");
        /* ex:3*/
        LocalDate lastMonday = LocalDate.of(2023, 07, 03);
        System.out.println("lastMonday = " + lastMonday);
        LocalDate lastSunday = LocalDate.of(2023, 07, 10);
        for (LocalDate date = lastMonday; date.isBefore(lastSunday); date = date.plusDays(1)) {
            System.out.println(date);
        }
        System.out.println("\n");
        /* ex:4*/
        LocalDate str = LocalDate.parse("2023-07-12");
        System.out.println("LocalDate : " + str);
        System.out.println("\n");
        /* ex:5*/
        LocalDate givenDate = LocalDate.of(1945, 05, 8);
        DayOfWeek dayOfWeek = DayOfWeek.from(givenDate);
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("\n");
        /* ex:6*/
        LocalDate toDay_plus_ten_years = LocalDate.now();
        toDay_plus_ten_years = toDay_plus_ten_years.plusYears(10).minusMonths(10);
        System.out.println("toDay_plus_ten_years_minus_ten_months = " + toDay_plus_ten_years);
        System.out.println("The month is: " + toDay_plus_ten_years.getMonth());
        System.out.println("\n");
        /* ex:7*/
        LocalDate start_date = LocalDate.of(1990, 7, 25);
        LocalDate end_date = LocalDate.of(2032, 9, 11);
        findDifference(start_date, end_date);
        System.out.println("\n***************************************************************");
        LocalDate startnew_date = LocalDate.of(1945, 5, 8);
        LocalDate endnew_date = LocalDate.of(1990, 7, 25);
        findDiff(startnew_date, endnew_date);
        /* ex:8*/


    }

    private static void findDifference(LocalDate start_date, LocalDate end_date) {
        Period diff = Period.between(start_date, end_date);
        System.out.print("Difference " + "between two dates is: ");
        System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
    }
    private static void findDiff(LocalDate startnew_date, LocalDate endnew_date) {
        Period diff = Period.between(startnew_date, endnew_date);
        System.out.print("Difference " + "between two dates is: ");
        System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
    }


}
