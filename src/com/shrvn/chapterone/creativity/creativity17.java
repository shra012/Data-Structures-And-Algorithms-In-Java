package com.shrvn.chapterone.creativity;

import java.util.Scanner;

public class creativity17  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of th array");
        int len = sc.nextInt();
        int a[] = new int[len];
        boolean result=false;
        System.out.println("Enter the values of th array");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
                result=true;
        }
        if(result)
            System.out.println("Yes the array contains a pair of numbers whose product is even");
        else
            System.out.println("No the array dose not contains a pair of numbers whose product is even");


    }
}
