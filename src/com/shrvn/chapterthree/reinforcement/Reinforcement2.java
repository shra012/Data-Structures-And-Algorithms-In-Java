package com.shrvn.chapterthree.reinforcement;

import java.util.Arrays;
import java.util.Random;

public class Reinforcement2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		removeRandomMyself(a);
		System.out.println(Arrays.toString(a));
	}

	private static void removeRandom(int[] a) {
		Random random = new Random();
		for(int i=0;i<a.length;i++) {
			int index = 0;
			for(int j = index; j < a.length-i-1; j++){
				// Move next elements one step backwards
				a[j] = a[j+1];
			}
			a[a.length-i-1] = 0;

		}
	}
	
	private static void removeRandomMyself(int[] a) {
		Random random = new Random();
		for(int i=0;i<a.length;i++) {
			int temp = a.length-i;
			int index = random.nextInt(temp);
			// Move next elements one step backwards
			a[index] = 0;
			int last = a[temp-1];
			a[temp-1] = a[index];
			a[index] = last;
		}
	}
}
