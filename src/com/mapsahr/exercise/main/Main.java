package com.mapsahr.exercise.main;

import com.mapsahr.exercise.calculators.ExtendedCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator Lab.");
        System.out.println("========================");
        System.out.println("Please enter user numbers with comma (,) and then press enter: ");

        String userRawInput = scanner.nextLine();
        if (userRawInput.equals("")) {
            System.err.println("Not any number entered!!!");
            return;
        }
        String[] userSplitInput = userRawInput.split(",");
        Integer[] userInput = new Integer[userSplitInput.length];
        for (int i = 0; i < userSplitInput.length; i++) {
            userInput[i] = Integer.parseInt(userSplitInput[i]);
        }
        System.out.println("Your entered numbers are: " + Arrays.toString(userInput));
        System.out.println("####################");

        while (true) {

            System.out.println("Select a function from the below list or type `exit` for quite from the program: ");
            System.out.println("1. minimum of the numbers.");
            System.out.println("2. list of prime numbers.");
            System.out.println("3. average of the numbers.");
            System.out.println("4. the count of a specific number");
            System.out.println("5. reverse the numbers.");
            System.out.println("6. sub array of the numbers.");

            String userSelectedFunction = scanner.nextLine();
            if (userSelectedFunction.equals("exit")) {
                break;
            }

            switch (userSelectedFunction) {
                case "1":
                    System.out.println("the minimum is: " + (ExtendedCalculator.min(userInput)));
                    System.out.println("#######################");
                    break;
                case "2":
                    System.out.println("the prime numbers are: " + Arrays.toString(ExtendedCalculator.primes(userInput)));
                    System.out.println("#######################");
                    break;
                case "3":
                    System.out.println("the average is: " + ExtendedCalculator.avg(userInput));
                    System.out.println("#######################");
                    break;
                case "4":
                    System.out.println("Enter a number: ");
                    Scanner scannerNumber = new Scanner(System.in);
                    int number = scannerNumber.nextInt();
                    System.out.println("the count of " + number + " is: " + ExtendedCalculator.count(userInput, number));
                    System.out.println("#######################");
                    break;
                case "5":
                    System.out.println("the reverse numbers is: " + Arrays.toString(ExtendedCalculator.reverse(userInput)));
                    System.out.println("#######################");
                    break;
                case "6":
                    System.out.println("Enter start index: ");
                    Scanner scannerStart = new Scanner(System.in);
                    int start = scannerStart.nextInt();
                    System.out.println("Enter end index: ");
                    Scanner scannerEnd = new Scanner(System.in);
                    int end = scannerEnd.nextInt();
                    System.out.println("the sub array is: " + Arrays.toString(ExtendedCalculator.subArray(userInput, start, end)));
                    System.out.println("#######################");
                    break;
                default:
                    System.err.println("Please enter a valid number.");
                    System.err.println("#######################");
            }
        }


    }
}
