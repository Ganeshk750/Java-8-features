package com.java.primer;


/**
 * @created: 10/03/2021 - 1:24 PM
 * @author: Ganesh
 */


public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String cust, String bk, String acnt, int lim){
        this(cust, bk, acnt, lim, 0.0); // Use a balance of zero as default
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

    // Update Methods
    public boolean charge(double price){
        if(price + balance > limit) {
            return false;
        }else{
            balance +=price;
            return true;
        }
    }

    public void makePayment(double amount){
        balance -= amount;
    }

    public static void printSummery(CreditCard card){
        System.out.println("Customer = "+ card.customer);
        System.out.println("Bank = "+ card.bank);
        System.out.println("Account = "+ card.account);
        System.out.println("Balance = "+ card.balance);
        System.out.println("Limit = "+ card.limit);
        System.out.println("========================");
    }

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Saving", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "5391 0375 9387 1554", 5000);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 9632", 5000);

        for(int val = 1; val <= 16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for(CreditCard card: wallet){
            CreditCard.printSummery(card);
            while(card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New Balance = "+ card.getBalance());
            }
        }
    }

}













