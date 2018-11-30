package com.example.pikamouse.arithmetic.string;

/**
 * create by liting 2018/10/12
 */
public class LeetCode344 {


    public String reverseString(String s) {
        char [] array = s.toCharArray();
        int mid = array.length/2;
        int sLength = array.length-1;
        char temp;
        for(int i=0; i<mid; i++){
            temp = array[i];
            array[i] = array[sLength-i];
            array[sLength-i] = temp;
        }
        return String.valueOf(array);

    }
}
