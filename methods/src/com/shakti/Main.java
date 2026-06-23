package com.shakti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter the first number");
        num1 =sc.nextInt();
        System.out.print("enter the second number");
        num2 = sc.nextInt();
        num3 = num1 + num2;
        System.out.print("the answer is:-> "+num3);
    }
}
