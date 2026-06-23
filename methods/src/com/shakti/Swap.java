package com.shakti;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int c = 10;
        int b = 20;

        swap(c, b);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a = " + a + ", b = " + b);
        ;
    }
}
