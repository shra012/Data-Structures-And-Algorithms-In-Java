package com.shrvn.chapterone;

import java.util.Scanner;

public class Reinforcement5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
