package com.shrvn.chapterthree.reinforcement;

import java.util.Arrays;

public class Reinforcement13 {
	public static void main(String[] args) {
		Integer[] ints = {1,2,3}; 
		Integer[] int2s = {1,2,3}; 
		Object[] a = {1125,ints,3265,4548,54545,48486};
		Object[] b = {1125,int2s,3265,4548,54545,48486};
		Reinforcement13 reinforcement = new Reinforcement13();
		System.out.println(reinforcement.shallowEquals(a, b));
		System.out.println(reinforcement.deepEquals(a, b));
	}

	/**
	 * A shallow Equality checks if the arrays compared are of equal size and have the 
	 * same elements.
	 * @return True if the all the elements of the array match, if not False.
	 */
	public boolean shallowEquals(Object a[],Object b[]){
		// check if both the references are equal. if so return true
		if(a == b)
			return true;
		// return false if either of the values are null.
		if(a == null || b == null)
			return false;
		// return false if the lengths of the arrays are different.
		if(a.length != b.length)
			return false;
		// Iterate through the array and check if each value is equal
		for (int i = 0; i < b.length; i++) {
			//return false if the values are not equal.
			if(!a[i].equals(b[i]))
				return false;
		}
		// True if it passes all the conditions.
		return true;
	}

	public boolean deepEquals(Object a[],Object b[]) {
		// check if both the references are equal. if so return true
		if(a == b)
			return true;
		// return false if either of the values are null.
		if(a == null || b == null)
			return false;
		// return false if the lengths of the arrays are different.
		if(a.length != b.length)
			return false;
		// Iterate through the array and check if each value is equal
		for (int i = 0; i < b.length; i++) {
			boolean eq = false;
			//check for all the available types for equality
			if(a[i] instanceof Object[] && b[i] instanceof Object[]) {
				eq = deepEquals((Object[]) a[i],(Object[]) b[i]);	
			}else if(a[i] instanceof int[] && b[i] instanceof int[]) {
				eq = Arrays.equals((int[]) a[i],(int[]) b[i]);
			}else if(a[i] instanceof short[] && b[i] instanceof short[]) {
				eq = Arrays.equals((short[]) a[i],(short[]) b[i]);
			}else if(a[i] instanceof char[] && b[i] instanceof char[]) {
				eq = Arrays.equals((char[]) a[i],(char[]) b[i]);
			}else if(a[i] instanceof byte[] && b[i] instanceof byte[]) {
				eq = Arrays.equals((byte[]) a[i],(byte[]) b[i]);
			}else if(a[i] instanceof long[] && b[i] instanceof long[]) {
				eq = Arrays.equals((long[]) a[i],(long[]) b[i]);
			}else if(a[i] instanceof boolean[] && b[i] instanceof boolean[]) {
				eq = Arrays.equals((boolean[]) a[i],(boolean[]) b[i]);
			}else if(a[i] instanceof double[] && b[i] instanceof double[]) {
				eq = Arrays.equals((double[]) a[i],(double[]) b[i]);
			}else if(a[i] instanceof float[] && b[i] instanceof float[]) {
				eq = Arrays.equals((float[]) a[i],(float[]) b[i]);
			}else 
				eq = a[i].equals(b[i]);

			if(!eq) //return false if the values are not equal.
				return false;
		}
		return true;
	}
}
