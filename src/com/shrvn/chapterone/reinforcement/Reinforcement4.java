package com.shrvn.chapterone.reinforcement;

import java.util.Scanner;

public class Reinforcement4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of i");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (isEven(i)) {
            System.out.println("The number is even");
            return;
        }
        System.out.println("The number is odd");
    }

    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }
}
