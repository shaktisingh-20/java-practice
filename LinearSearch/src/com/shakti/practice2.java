package com.shakti;
//search in range
public class practice2 {
    public static void main(String[] args) {
        int [] arr = {12,34,56,76,34,21};
        int target = 56;
        int ans = linearRange(arr,target,3,5);
        System.out.println(ans);
    }

    static int linearRange (int [] nums, int target, int start, int end){
        if (nums.length == 0) {
            return -1;
        }
        for (int index = start; index <end ; index++) {
            int element = nums[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
