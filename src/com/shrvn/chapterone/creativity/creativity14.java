package com.shrvn.chapterone.creativity;

import java.util.Arrays;

public class creativity14 {
    public static void main(String[] args) {
        int [] i = {1,2,3,4,5,6,7,8,9};
        reverse(i);
        System.out.println(Arrays.toString(i));
    }

    public static void reverse(int[] array){
        reverse(array,0,array.length);
    }

    public static void reverse(int[] array,int startIndex,int endIndex){
        if(null==array)
            return;
        int start = (startIndex<0) ? 0 : startIndex;
        int end = Math.min(array.length, endIndex)-1;
        int tmp;
        while(start<end){
            tmp = array[end];
            array[end] = array[start];
            array[start] = tmp;
            end--;
            start++;
        }
    }
}
