package com.shrvn.chapterone.creativity;

public class creativity18 {
    public static void main(String[] args) {
        int a[] ={3,4};
        norm(a);
        norm(a,3);

    }
    public static void norm(int[] v,int p){
        int sum=0;
        for (int i = 0; i < v.length; i++) {
            sum += Math.pow(v[i],p);
        }
        System.out.println(nthRoot(sum,p));
    }

    public static void norm(int[] v){
        int sum=0;
        for (int i = 0; i < v.length; i++) {
            sum += Math.pow(v[i],2);
        }
        System.out.println((int)Math.sqrt(sum));
    }

    public static double nthRoot(int value , int n){
        if(value==0 || n==0)
            return 0;

        return Math.pow(value, 1.0 / n);
    }

}
