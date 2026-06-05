package com.shakti;

import java.util.Scanner;

public class Temperature {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in celsius : ");
        int tempC = sc.nextInt();
        int tempF = (tempC * 9/5) + 32;
        System.out.println("the temp in farenhiet is : " + tempF);
    }
}
