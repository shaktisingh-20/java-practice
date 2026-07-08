package com.shakti;

public class minValue {
    public static void main(String[] args) {
        int []nums = {12,34,6,53,-7,67,45};
        System.out.println(min(nums));
    }

    static int min(int[]arr){
        int ans = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if(arr[index] < ans){
                ans=arr[index];
            }
        }
        return ans;
    }
}
