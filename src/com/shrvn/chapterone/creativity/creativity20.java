package com.shrvn.chapterone.creativity;

import java.util.Scanner;

public class creativity20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        float[] array = new float[size];
        System.out.println("Enter all the " + size + " elements of the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextFloat();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j && array[i] == array[j]) {
                    System.out.println("elements are not unique");
                    return;
                }
            }
        }
        System.out.println("elements are unique");
    }
}
