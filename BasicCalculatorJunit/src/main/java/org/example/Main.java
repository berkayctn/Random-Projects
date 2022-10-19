package org.example;

import java.util.Scanner;

// In this project I made a basic calculator with unit tests.
// The calculator can perform 5 different operations
// (Four operations are classic and you can see which operations you have done by looking at the history)



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        History history = new History();
        int numberOfOperation = 1;

        while (true) {
            System.out.println("Which operation do you want to do ? ");
            System.out.println("""
                    1- Summation
                    2- Abstraction
                    3- Multiplication
                    4- Division\040
                    5- History
                    0- Exit""".indent(1));

            int whichOne = scanner.nextInt();
            scanner.nextLine();

            if (whichOne == 0) {
                System.out.println("Closing...");
                break;
            } else if (whichOne > 0 && whichOne <= 5) {
                switch (whichOne) {
                    case 1 -> {
                        System.out.println("Enter numbers for sum: ");
                        System.out.println("First number: ");
                        int firstNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Second number: ");
                        int secondNumber = scanner.nextInt();
                        scanner.nextLine();
                        history.addToHistory(numberOfOperation + "- Summation", "" + operations.summation(firstNumber, secondNumber));
                        numberOfOperation++;
                        System.out.println("The result is: " + operations.summation(firstNumber, secondNumber));
                    }
                    case 2 -> {
                        System.out.println("Enter numbers for subtraction: ");
                        System.out.println("First number: ");
                        int firstNumber1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Second number: ");
                        int secondNumber1 = scanner.nextInt();
                        scanner.nextLine();
                        history.addToHistory(numberOfOperation + "- Subtraction", "" + operations.subtraction(firstNumber1, secondNumber1));
                        numberOfOperation++;
                        System.out.println("The result is: " + operations.subtraction(firstNumber1, secondNumber1));
                    }
                    case 3 -> {
                        System.out.println("Enter numbers for multiplication: ");
                        System.out.println("First number: ");
                        int firstNumber2 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Second number: ");
                        int secondNumber2 = scanner.nextInt();
                        scanner.nextLine();
                        history.addToHistory(numberOfOperation + "- Multiplication", "" + operations.multiplication(firstNumber2, secondNumber2));
                        numberOfOperation++;
                        System.out.println("The result is: " + operations.multiplication(firstNumber2, secondNumber2));
                    }
                    case 4 -> {
                        System.out.println("Enter numbers for division : ");
                        System.out.println("First number: ");
                        int firstNumber3 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Second number: ");
                        int secondNumber3 = scanner.nextInt();
                        scanner.nextLine();
                        history.addToHistory(numberOfOperation + "- Division", "" + operations.division(firstNumber3, secondNumber3));
                        numberOfOperation++;
                        System.out.println("The result is: " + operations.division(firstNumber3, secondNumber3));
                    }
                    case 5 -> {
                        history.showHistory();
                    }
                }
            } else {
                System.out.println("Please write a number in given range!");
            }
        }
        scanner.close();
    }
}