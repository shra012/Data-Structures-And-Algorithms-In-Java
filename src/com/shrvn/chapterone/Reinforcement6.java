package com.shrvn.chapterone;

import java.util.Scanner;

public class Reinforcement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (!Reinforcement4.isEven(i))
                result += i;
        }
        System.out.println(result);
    }
}
