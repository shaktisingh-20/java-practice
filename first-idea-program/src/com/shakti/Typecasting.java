package com.shakti;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(45.67);
        System.out.println(num);

        //automatic type promotion in expression
        int a = 257;
        byte b =  (byte)(a); // 257 % 256 = 1
        System.out.println(b);

        byte k = 41;
        byte l = 23;
        int m = k * l ;
        System.out.println(m);
        System.out.println("你好");
    }
}
