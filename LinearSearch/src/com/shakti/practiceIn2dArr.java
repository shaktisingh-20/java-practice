package com.shakti;

import java.util.Arrays;

public class practiceIn2dArr {
    public static void main(String[] args) {
        int [][] arr = {
                {12,23,45,67,89},
                {87,37},
                {98,87,65,43}
        };
        int target = 98;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(minVal(arr));
        System.out.println(maxVal(arr));
    }

    static int[] search(int [][] num,int target){
        for (int row = 0; row < num.length; row++) {
            for (int col = 0; col < num[row].length; col++) {
                if (num[row][col] == target) {
                    return new int[]  {row,col}; // [2,0]
                }
            }
        }
        return new int[] {-1,-1};
        }


    static int minVal(int [] [] arrays) {
        if (arrays.length == 0) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arrays.length; row++) {
            for (int col = 0; col < arrays[row].length; col++) {
                if (arrays[row][col] < min) {
                    min= arrays[row][col];
                }
            }
        }
        return min;
    }


    static int maxVal(int [][] arr){
        if (arr.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
    }

