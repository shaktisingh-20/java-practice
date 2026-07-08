package com.shakti;

import java.lang.reflect.Array;
import java.util.Arrays;

public class searchInStrings {
    public static void main(String[] args) {
        String name = "Shakti";
        char target = 'l';
        System.out.println(search(name,target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String name, char target){
        if (name.length() ==0){
            return false;
        }
        for (int index = 0; index < name.length(); index++) {
            if(target == name.charAt(index)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String name, char target){
        if (name.length() == 0){
            return false;
        }
        // using foreach loop
        for(char ch :name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
