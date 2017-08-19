package com.shrvn.chapterone.reinforcement;

import com.shrvn.chapterone.reinforcement.pojos.CreditCard;

public class Reinforcement13 {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);
        for (int val = 1; val <= 110; val++) {
            if (wallet[0].charge(3 * val)){
            }else{
                System.out.println("Hi "+wallet[0].getCustomer()+" your credit card associated with "+wallet[0].getBank()+" bank blocked please make payment");
                return;
            }
            if(wallet[1].charge(2 * val)){

            }else{
                System.out.println("Hi "+wallet[1].getCustomer()+" your credit card associated with "+wallet[1].getBank()+" bank blocked please make payment");
                return;
            }
            if( wallet[2].charge(val)){
            }else{
                System.out.println("Hi "+wallet[2].getCustomer()+" your credit card associated with "+wallet[2].getBank()+" bank blocked please make payment");
                return;
            }
        }
        for (CreditCard card : wallet) {
            System.out.println("------------------------------------");
            CreditCard.printSummary(card);
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());

            }

        }
    }
}
