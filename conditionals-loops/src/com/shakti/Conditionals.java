package com.shakti;

public class Conditionals {
    static void main(String[] args) {
        /* Syntax of if else
        * if(condition){
        * body
        * }else{
        * body
        * }*/

        int salary = 30000;
        if(salary > 20000){
            salary = salary + 2000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);
    }
}
