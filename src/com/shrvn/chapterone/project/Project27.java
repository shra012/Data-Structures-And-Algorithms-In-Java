package com.shrvn.chapterone.project;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------Welcome to shravans calculator----------------");
        System.out.println("Enter a operator or an operand");
        String input = sc.next();
        String [] chars = {"+","-","*","/"};
        List<String> characterList = Arrays.asList(chars);
        if(characterList.contains(input)){
            double a = getOperand(sc,"first");
            double b = getOperand(sc,"second");
            calculate(a,b,input);
        }else{
            double a = checkInput(input);
            double b = getOperand(sc,"second");
            System.out.println("Enter a operator");
            String operator = sc.next();
            if(characterList.contains(operator)){
                calculate(a,b,operator);
            }else {
                System.out.println("Invalid Input");
                main(null);
            }
        }
    }
    private static double getOperand(Scanner sc,String position){
        System.out.println("Enter the "+position+" operand ");
        Double i;
        try{
            i = Double.parseDouble(sc.next());
        }catch (NumberFormatException e){
            System.out.println("Please enter a valid operand ");
           return getOperand(sc,position);
        }
        return i;
    }
    private static double checkInput(String input){
        Double i=null;
        if(null==input || input.isEmpty()){
            System.out.println("Invalid Input");
            main(null);
        }
        try{
            i = Double.parseDouble(input);
        }catch (NumberFormatException e){
            System.out.println("Invalid Input");
            main(null);
        }
        return i;
    }

    private static void calculate(double a,double b,String operator){
        switch (operator) {
            case "+":{ System.out.println(a+b); System.exit(0);}
            case "-": {System.out.println(a-b); System.exit(0);}
            case "*": {System.out.println(a*b); System.exit(0);}
            case "/": {System.out.println(a/b); System.exit(0);}
            default: {
                System.out.println("Invalid Input");
                main(null);
            }
        }
    }

}
