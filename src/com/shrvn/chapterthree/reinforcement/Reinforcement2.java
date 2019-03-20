package com.shrvn.chapterthree.reinforcement;

import java.util.Random;

public class Reinforcement2 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		removeRandomMyself(a);
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
			int index = random.nextInt(a.length-1);
			for(int j = index; j < index; j++){
				// Move next elements one step backwards
				a[j+1] = a[j];
			}
			a[i] = 0;

		}
	}
}
