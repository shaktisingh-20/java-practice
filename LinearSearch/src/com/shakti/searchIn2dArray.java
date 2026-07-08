package com.shakti;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int [][] nums = {
                {12,34,4,56,67,43,34},
                {23,76,57,53},
                {2,65,32,67,121,8}
        };
        int target = 57;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(min(nums));

    }
    static int[] search (int [][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int [] {row,col};
                }
            }
        }
        return new int [] {-1,-1};
    };

    static int max (int [][]arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max ){
                    max = arr[row][col];
                }
            }
        }
        return max;
    };

    static int min (int [][]arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min ){
                    min = arr[row][col];
                }
            }
        }
        return min;
    };
}
