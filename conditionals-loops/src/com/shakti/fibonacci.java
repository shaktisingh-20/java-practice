package com.shakti;

import java.util.Scanner;

public class fibonacci {
    static void main(String[] args) {
        System.out.println("Enter the number to find its fabonacci number => ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b= 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        }
        System.out.println(b);
    }
}
