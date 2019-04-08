package com.shrvn.chapterthree.reinforcement.pojos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] array = {2,4,7,5,3,1,6};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertionSort(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            int j=i-1;
            while(j>=0 && data[j]>key){
                data[j+1]=data[j];
                j--;
            }
            data[j+1] = key;
        }
    }
}
