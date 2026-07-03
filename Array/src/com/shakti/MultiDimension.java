package com.shakti;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */
        int [] [] arr2 = new int [3][];
        int [] [] arr = {
                {1,2,3},
                {4,5},
                {7,8,9,12},
        };
        System.out.println(arr[1][0]);
    }
}
