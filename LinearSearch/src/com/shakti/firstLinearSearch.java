package com.shakti;

public class firstLinearSearch {
    public static void main(String[] args) {
        int [] arr = {21,43,45,18,36,89,-1};
        int target = 18;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[]nums, int target){
        if(nums.length==0){
            return -1;
        }

        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    static int search2(int[]nums, int target){
        if(nums.length==0){
            return -1;
        }

        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }


    //gives true or false
    static boolean search3(int[]nums, int target){
        if(nums.length==0){
            return false;
        }

        for (int element : nums) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
