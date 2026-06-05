package com.shakti;

import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter some  input : ");
        int roll = input.nextInt();
        System.out.println("your roll number is : " + roll);
    }
}
