package com.shrvn.chapterone.creativity;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class creativity21 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52};

        fisherYatesShuffleAlgorithm(a);

    }

    public static void fisherYatesShuffleAlgorithm(int[] array) {
        Random r = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
