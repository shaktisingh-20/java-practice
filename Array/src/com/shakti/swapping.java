package com.shakti;

import java.util.Arrays;

public class swapping {
    public static void main(String[] args) {
        int [] arr={23,45,66,87,98,65} ;
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr, int index1,int index2){
        int temp = arr [index1];
        arr [index1] =arr [index2] ;
        arr[index2] = temp;
    };
}
