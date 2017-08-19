package com.shrvn.chapterone.reinforcement;

import com.shrvn.chapterone.reinforcement.pojos.CreditCard;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Reinforcement11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer name");
        String customer = sc.next();
        System.out.println("Enter Customer bank");
        String bank = sc.next();
        System.out.println("Enter Customer account number");
        String AccountNumber = sc.next();
        System.out.println("Default balance is zero and default credit limit is "+ Currency.getInstance(new Locale("en", "IN")).getSymbol() + " 350000");
        System.out.println("Default account balance is "+ Currency.getInstance(new Locale("en","IN")).getSymbol() + " 0.00");
        CreditCard card=new CreditCard(customer,bank,AccountNumber,35000,0);
        System.out.println("Credit card summary before update of limit");
        CreditCard.printSummary(card);
        System.out.println("Enter Credit limit to be updated");
        int creditLimit = sc.nextInt();
        card.updateCreditCardLimit(creditLimit);
        System.out.println("Credit limit updated successfully. PLease find th updated values");
        CreditCard.printSummary(card);
    }
}
