package com.shakti;

import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1=> print numbers from 1 to 5
//        for(int i = 1; i<=5 ; i++){
//            System.out.println(i);
        //Q2=> print numbers from 1 to n.
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        for (int i = 1; i<=n ; i++) {
//            System.out.println(i);
//        }
        //print the same with while loop

        int i = 0;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
}
