package com.shrvn.chapterone.creativity;

import java.util.Arrays;
import java.util.Scanner;

public class creativity23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(Arrays.toString(c));
    }

}
