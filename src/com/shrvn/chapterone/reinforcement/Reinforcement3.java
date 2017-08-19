package com.shrvn.chapterone.reinforcement;

import java.util.Scanner;

public class Reinforcement3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Enter the value of m");
        long m = sc.nextLong();
        System.out.print("Calculating");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println(".");
        Thread.sleep(1000);
        if (isMultiple(n, m)) {
            System.out.println("Yes n is a multiple of m");
            return;
        }
        System.out.println("No n is a not multiple of m");
    }

    public static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }
}
