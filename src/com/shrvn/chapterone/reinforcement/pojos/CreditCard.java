package com.shrvn.chapterone.reinforcement.pojos;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;


    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {

        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

        public boolean charge(double price) {
        if(price>0) {
            if (price + balance > limit)
                return false;

            balance += price;
            return true;
        }else{
            return false;
        }
    }

    public void makePayment(double amount) {

        balance -= amount;
    }

    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }


    public void updateCreditCardLimit(int limit){
        this.limit=limit;
    }

    public void addCreditCardLimit(int limit){
        this.limit=this.limit+limit;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "customer='" + customer + '\'' +
                ", bank='" + bank + '\'' +
                ", account='" + account + '\'' +
                ", limit=" + limit +
                ", balance=" + balance +
                '}';
    }
}
