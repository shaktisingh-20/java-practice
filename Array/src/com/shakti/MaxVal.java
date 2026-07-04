package com.shakti;

public class MaxVal {
    public static void main(String[] args) {
        int [] arr = {12,23,45,12,23,32};
        System.out.println(maxRange(arr,3,5));
    }
    static int max(int[]arr){
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    };

    static int maxRange(int[]arr,int start, int end){
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
