package com.shrvn.chapterone.reinforcement;

import java.util.Scanner;

public class Reinforcement1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the type of variable you want to print by entering the number for the respective type \n1).int" +
                    "\n2).double\n3).byte\n4).short\n5).char\n6).float\n7).long\n8).boolean");
            Integer type = Integer.parseInt(sc.next());
            System.out.println("Enter the value for the selected data type");
            switch (type) {
                case 1:
                    inputAllBaseTypes(sc.nextInt());
                case 2:
                    inputAllBaseTypes(sc.nextDouble());
                case 3:
                    inputAllBaseTypes(sc.nextByte());
                case 4:
                    inputAllBaseTypes(sc.nextShort());
                case 5:
                    inputAllBaseTypes(sc.next().charAt(0));
                case 6:
                    inputAllBaseTypes(sc.nextFloat());
                case 7:
                    inputAllBaseTypes(sc.nextLong());
                case 8:
                    inputAllBaseTypes(sc.nextBoolean());
                default:
                    System.out.println("Please enter a valid input");
            }
            sc.close();
        }catch (Exception exception){
            if(exception.getClass().getName().contains("java.util.InputMismatchException")){
                System.out.println("Entered value and data type does not match each other");
            }else{
                exception.fillInStackTrace();
            }
        }
    }
    public static int inputAllBaseTypes(int input){
        System.out.println("Selected data type is int and value is "+input);
        return input;
    }
    public static double inputAllBaseTypes(double input){
        System.out.println("Selected data type is double and value is "+input);
        return input;
    }
    public static byte inputAllBaseTypes(byte input){
        System.out.println("Selected data type is byte and value is "+input);
        return input;
    }
    public static short inputAllBaseTypes(short input){
        System.out.println("Selected data type is short and value is "+input);
        return input;
    }
    public static char inputAllBaseTypes(char input){
        System.out.println("Selected data type is char and value is "+input);
        return input;
    }
    public static float inputAllBaseTypes(float input){
        System.out.println("Selected data type is float and value is "+input);
        return input;
    }
    public static long inputAllBaseTypes(long input){
        System.out.println("Selected data type is long and value is "+input);
        return input;
    }
    public static boolean inputAllBaseTypes(boolean input){
        System.out.println("Selected data type is boolean and value is "+input);
        return input;
    }
}
