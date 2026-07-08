package com.shakti;

public class searchInRange {
    public static void main(String[] args) {
        int[] nums = {12,3,65,76,7,43,23,77,32};
        int target = 3;
        int ans = search(nums,target,1,4);
        System.out.println(ans);
    }

    static int search(int[]arr, int target, int start, int end){
        if(arr.length == 0) {
            return -1;
        }

        for (int index = start; index <end ; index++) {
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;
    }
}
