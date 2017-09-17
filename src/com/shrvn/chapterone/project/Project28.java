package com.shrvn.chapterone.project;

public class Project28 {
    public static void main(String[] args) {
        String input = "I will never spam my friends again.";
        int i=0;
        int j=0;
        while (i<1000){

            System.out.println(i +"). "+ new StringBuilder(input).insert(j,'a').toString());
            i++;j++;
            if(j>7){
                j=0;
            }
        }
    }
}
