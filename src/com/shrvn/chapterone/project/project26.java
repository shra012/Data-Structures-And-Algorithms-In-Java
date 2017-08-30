package com.shrvn.chapterone.project;

import java.util.Scanner;

public class project26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        // didnt you sc.nextInt() because when you read sc.nextLine() after sc.nextInt()
        // it would return and ""(Empty String) to denote the rest of the line.
        int n = Integer.parseInt(sc.nextLine());
        String array[] = new String[n];
        System.out.println("Enter the lines");
        for (int i = 0; i < array.length; i++) {
            String line = sc.nextLine();
            if(!line.isEmpty()) {
                array[i] = line;
            }
        }
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
