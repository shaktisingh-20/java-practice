package com.shakti;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the operator + - * % / (or x to exit) => ");
        char op = sc.next().trim().charAt(0);

        if (op == 'x' || op == 'X') {
            System.out.println("Exiting...");
            return;
        }

        int ans = 0;

        if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            if (op == '+') {
                ans = num1 + num2;
            }
            if (op == '-') {
                ans = num1 - num2;
            }
            if (op == '*') {
                ans = num1 * num2;
            }
            if (op == '%') {
                ans = num1 % num2;
            }
            if (op == '/') {
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                ans = num1 / num2;
            }

        } else {
            System.out.println("No valid operator!");
            return;
        }

        System.out.println("The answer is = " + ans);
    }
}