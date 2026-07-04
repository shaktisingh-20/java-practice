package com.shakti;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9
        */
//        int [] [] arr2 = new int [3][];
//        int [] [] arr = {
//                {1,2,3},
//                {4,5},
//                {7,8,9,12},
//        };

        int [][] arr = new int [3][2];
        Scanner in = new Scanner(System.in);

//        for (int row= 0; row< arr.length; row++){
//            //for each column in every row
//            for (int col = 0;col < arr[row].length; col++){
//                arr[row][col] = in.nextInt();
//            };
//        }
//        System.out.println(Arrays.deepToString(arr));
        for (int row=0; row< arr.length; row++){
            //for each col in rw
            for (int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
