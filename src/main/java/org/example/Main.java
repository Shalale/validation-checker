package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Validator inputValidation = new InputValidator();
        Output output = new Output();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Phone Number Validation Checker");

        while (true) {
            System.out.print("Enter a phone number separated by spaces (e.g., 0 0 30 69 74 0 9 22 52): ");
            String number = scanner.nextLine();

            if (!inputValidation.isValid(number)){
                System.out.println("Phone number format is incorrect!");
                System.out.print("Enter a phone number separated by spaces (e.g., 0 0 30 69 74 0 9 22 52): ");
                number = scanner.nextLine();
            }

            output.simpleValidationOutput(number);

            System.out.print("Do you want to continue (Y/N)? ");
            String continueInput = scanner.nextLine().trim().toLowerCase();

            if (!continueInput.equals("y")) {
                break;
            }
        }
    }
}