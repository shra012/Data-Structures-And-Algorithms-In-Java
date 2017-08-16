package com.shrvn.chapterone;

import java.util.Scanner;

public class Reinforcement9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to replace punctuations");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        for (int i = sb.length()-1; i>=0; i--) {
            if(sb.charAt(i)=='!' || sb.charAt(i)=='\'' || sb.charAt(i)=='.'| sb.charAt(i)==','|| sb.charAt(i)=='?' || sb.charAt(i)=='\"'){
                sb.deleteCharAt(i);
            }
        }
        System.out.println(sb);
    }
}
