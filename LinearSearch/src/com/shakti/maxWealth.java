package com.shakti;
// 1672 maxwealth
public class maxWealth {
    public static void main(String[] args) {
        int [][] arr = {
            {1,5},
            {7,3},
            {3,5}
        };
    }


    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int persons = 0; persons < accounts.length; persons++) {
            int sum = 0;
            for (int account = 0; account < accounts[persons].length; account++) {
                sum = sum + accounts[persons][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
