package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The multiplication result of" + num1 + " and " + num2 + " is: "
                + multiply(num1, num2));
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));

        scanner.close();
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

}
