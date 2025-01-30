package com.javatutorial.part4.StudentCafe;

public class PaymentCard {
    private double balance;


    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of "+ this.balance + " euros";
    }

    //making transaction through cards
    public void eatAffordably() {
        if (this.balance>=2.6 ) {
            this.balance = this.balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance>=4.60){
            this.balance=this.balance-4.60;
        }

    }

    //topping up the card balance
    public void addMoney(double amount) {
        if (amount>0){
            this.balance=this.balance+amount;
        }

    }

}
