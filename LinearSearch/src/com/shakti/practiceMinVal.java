package com.shakti;

public class practiceMinVal {
    public static void main(String[] args) {
        int [] arr = {12,34,3,45,576,};
        int minVal = findMinVal(arr);
        System.out.println(minVal);
    }

    static int findMinVal(int[]num){
        int ans = num[0];
        if (num.length == 0) {
            return -1;
        }
        for (int index = 0; index < num.length; index++) {

            if(num[index]<ans){
                ans = num[index];
            }
        }
        return ans;
    }
}
