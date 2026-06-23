package com.shakti;

public class Scope {
    public static void main(String[] args) {
        int a = 12;
        int b = 17;
        String s = "Shakti";

        // Block Scope
        {
            a = 90;
            int c = 89;
            s = "Ritu";
            String k = "Kartik";
        }

        System.out.println(a);
        System.out.println(s);
        random(30);

        // Scoping in for-loops
        // Variables declared in the init block are local to the loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int j = 12;
            int p = 13;
        }
    }
        //method scope
    static void random(int marks) {
        int num1 = 12;
        System.out.println(marks);
        System.out.println(num1);
    }
}