package com.teachmeskills.lesson_17.task_1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Create a generalized functional interface.
 * Write a class with one method.
 * In this method, implement the logic:
 * - if the number 1 is entered into the console, then: use the interface with a string type and pass the logic of reversing the string (outputting the string in reverse order) to the interface method.
 * - if the number 2 is entered into the console, then: use the interface with an integer type and pass the logic of finding the factorial of the number to the interface method.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose method for task (1 to reverse String, 2 to find factorial) :");

        int enteredNumber = scanner.nextInt();
        scanner.nextLine();

        try {
            if (enteredNumber == 1){

                FuncInterf<String> funcFor1;

                funcFor1 = (inputString) -> {

                    System.out.println("Enter the string to convert: ");

                    inputString = scanner.nextLine();

                    return new StringBuilder(inputString).reverse().toString();
                };

                System.out.println("Result of 1 method: " + funcFor1.forTask(null));

            } else if (enteredNumber == 2) {

                FuncInterf<Integer> funcFor2;

                funcFor2 = (inputNumber) -> {

                    System.out.println("Enter the number to convert: ");

                    inputNumber = scanner.nextInt();

                    return IntStream.rangeClosed(1, inputNumber) // From Web
                            .reduce(1, (x, y) -> x * y);
                };

                System.out.println("Result of 2 method: " + funcFor2.forTask(null));
            }

        } catch (Exception e) {
            throw new RuntimeException("Entered number is wrong.");
        }
    }
}
