package com.shrvn.chapterone;

import java.util.Arrays;
import java.util.Scanner;

public class Reinforcement8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count vowels");
        String input = sc.next();
        char[] inputArray = input.toLowerCase().toCharArray();

        Character [] vowels = {'a', 'e', 'i', 'o', 'u'};
        int vowelsCount=0;
        for (int i = 0; i < inputArray.length; i++) {
          if(Arrays.asList(vowels).contains(inputArray[i])){
              vowelsCount=vowelsCount+1;
          }
        }
        System.out.println("Total vowels in the given string = "+vowelsCount);
    }
}
