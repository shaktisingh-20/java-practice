package com.shakti;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:=> ");
        int a = sc.nextInt();
        System.out.print("Enter the second number:=> ");
        int b = sc.nextInt();
        System.out.print("Enter the third number:=> ");
        int c = sc.nextInt();
        //Q Find the largest number from the user input

        int max = a;
        if(b>max){
            max = b;
        } if (c>max) {
            max = c;
        }
            System.out.println(max + " "+ "is the largest number");
    }
}
