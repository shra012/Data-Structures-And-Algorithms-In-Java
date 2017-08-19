package com.shrvn.chapterone.creativity;

public class creativity15 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        maxAndMin(a);
    }

    public static void maxAndMin(int[] array){
        if(null==array || array.length<0)
            return;
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max)
                max = array[i];
            if (array[i]<min)
                min=array[i];
        }
        System.out.println("Maximum value "+max +"\nMinimum value "+min);
    }
}
