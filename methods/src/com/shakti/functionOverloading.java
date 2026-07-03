package com.shakti;

public class functionOverloading {
    static void main(String[] args) {
        int sum1 = sum(2,4);
        System.out.println(sum1);
        int sum2 = sums(2,5,7);
        System.out.println(sum2);
    }
    static int sum(int a,int b ){
        return a+b;
    };

    static int sums(int a,int b, int c){
        return a+b+c;
    }
    static void fun(int j, String k){

    }
}
