package com.shrvn.chapterone.creativity;

import java.util.Scanner;

public class creativity19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the number greater than 2");
        int n = sc.nextInt();
        if (n >= 2) {
            numberOfTimesDivisible(n, 0);
        } else {
            System.out.println("Error number entered is less than two");
            main(new String[0]);
        }
    }

    public static int numberOfTimesDivisible(int input, int count) {
        if (input >= 2) {
            count += 1;
            numberOfTimesDivisible(input / 2, count);
            return count;
        } else {
            System.out.println("Number of times divisible by 2 is " + count);
            return count;
        }
    }
}
