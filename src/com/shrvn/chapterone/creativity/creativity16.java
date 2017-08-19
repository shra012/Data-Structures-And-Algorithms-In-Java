package com.shrvn.chapterone.creativity;

import java.util.Scanner;

public class creativity16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a b and c one by one");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if (a+b==c || b-c==a || a*b==c)
            System.out.println(true);
        else
            System.out.println(false);

    }
}
