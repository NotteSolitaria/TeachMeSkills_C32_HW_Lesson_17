package com.teachmeskills.lesson_17.task_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Get day of week by date.
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date: ");

        String dateForTask = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(dateForTask, formatter);

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        System.out.println("Day of the week according to the specified data: " + dayOfWeek);

    }
}
