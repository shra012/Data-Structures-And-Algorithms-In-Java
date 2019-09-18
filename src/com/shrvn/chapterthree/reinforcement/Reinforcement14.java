package com.shrvn.chapterthree.reinforcement;

import java.util.Arrays;

public class Reinforcement14 {
	public static void main(String[] args) {
		Integer[] d = {12,3,4,6};
		Object[] c = {12,d,4,6};
		
		Object[] a = {1,c,3,4,5};
		Object[] b = deepClone(a);
		System.out.println(b[1] == c);
		System.out.println(Arrays.deepToString(b));
	}
	
	public static Object[] clone(Object[] a) {
		Object[] result = new Object[a.length];
		for(int i=0;i<a.length;i++) {
			result[i] = a[i];
		}
		return result;
	}
	
	public static Object[] deepClone(Object[] a) {
		Object[] result = new Object[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i] instanceof Object[]) {
				result[i] = deepClone((Object[])a[i]);
			}else {
				result[i] = a[i];
			}
		}
		return result;
	}
}
