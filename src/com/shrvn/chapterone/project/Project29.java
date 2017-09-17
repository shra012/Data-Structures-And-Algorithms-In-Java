package com.shrvn.chapterone.project;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Project29 {
    public static void main(String[] args) {
        for (int i=0;i<=100;i=i+5){//for loop for the base case to test birthday paradox for n = 5,10,15,20,...,100
            System.out.println(birthdayParadox(i));
        }
    }

    private static int  birthdayParadox(int input) {
        Set<Integer> birthDays = new HashSet<Integer>();
        Random rand = new Random();
        int count =0;
        for (int i = 0; i < input; i++) { //for loop to generate n number of random birthdays
            int newDay = rand.nextInt(365); //Random to generate a day in the available 365 days.
            if (!birthDays.add(newDay)) {
                //System.out.println("Repeated Birthday " + newDay);
                count = count + 1;
            }
        }
        return count;
    }
}
