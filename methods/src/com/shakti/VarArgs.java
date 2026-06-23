package com.shakti;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      //  fun(1,2,3,67,44,56,5,6,75,68,7);
        multiple(2,3,"Shakti","mango");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        // 'v' acts as an array of Strings
        System.out.println("v: " + Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
