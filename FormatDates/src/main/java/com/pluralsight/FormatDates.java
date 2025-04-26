package com.pluralsight;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        String formatDate;
        DateTimeFormatter formatter;

        formatDate ="04/25/2025";
        formatter = DateTimeFormatter.ofPattern(("MM/dd/yyyy"));

                LocalDate birthDay = LocalDate.parse(formatDate, formatter);

        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);
        System.out.println(" Birthday " + birthDay.format(formatter));
    }
}
