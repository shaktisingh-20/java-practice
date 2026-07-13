package com.shakti;

public class practiceEvenNoDigits {
    public static void main(String[] args) {
        int [] num = {12,345,2,6,7896};
        System.out.println(findNumbers(num));
    }

    static int findNumbers(int[] nums){
        int count = 0;
        if (nums.length == 0) {
            return -1;
        }
        for (int num = 0; num < nums.length; num++) {
            if( even(nums[num])){
                count ++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int evenNumber = countDigit(num);
        if (evenNumber % 2 == 0) {
            return true;
        }
        return false;
    }

    static int countDigit(int num){
        int count = 0;
        while (num>0){
            count ++;
            num = num/10;
        }
        return count;
    }
}
