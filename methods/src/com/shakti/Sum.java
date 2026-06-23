package com.shakti;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }


    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int num1 = sc.nextInt();
        System.out.print("enter the second number");
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        return num3;
    };
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number");
        int num1 = sc.nextInt();
        System.out.print("enter the second number");
        int num2 = sc.nextInt();
        int num3 = num1 + num2;
        System.out.print("the answer is:-> " + num3);
    }
}
