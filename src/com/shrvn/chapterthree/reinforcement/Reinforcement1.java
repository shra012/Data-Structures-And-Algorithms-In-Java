package com.shrvn.chapterthree.reinforcement;

public class Reinforcement1 {
	
	public static void main(String[] args) {
		Reinforcement1.Random random =  new Reinforcement1.Random(92,12,5,100);
		for(int i=0;i<5;i++) {
			System.out.println(random.next());
		}
	}
	private static class Random{
		private int current;
		private int a;
		private int b;
		private int n;
		
		public Random(int seed,int a,int b,int n) {
			this.current = seed;
			this.a = a;
			this.b = b;
			this.n = n;
		}

		protected int next() {
			current = (a * current + b) % n ;
			return current;
		}
	}
}
