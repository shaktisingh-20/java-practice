package com.shakti;

import java.util.Arrays;

public class PassininFunctions {
    public static void main(String[] args) {
        int [] arr = {12,34,56,78,89};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr2){
        arr2 [3] = 98;
    }
}
