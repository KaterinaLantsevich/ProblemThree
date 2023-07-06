package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.nextLine();


        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = calculate(operator, num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
}

    private static double calculate(String operator, double num1, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Error: Division by zero");
                }
            default:
                throw new IllegalArgumentException("Error: Invalid operator");
        }
    }
}