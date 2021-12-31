package com.bridgelabz.objectorientedprograms;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Account {
    static LinkedList<Stock> Linkedlist = new Linkedlist<Stock>();
    Scanner sc = new Scanner(System.in);

    public void printReport(){
        if(Linkedlist.size()==0){
            System.out.println("Currently person have no share");
        }else {
            System.out.println("Portfolio of person");
            for (int j = 0; j < Linkedlist.size(); j++) {
                System.out.println(Linkedlist.get(j));
            }
        }
        particularStock();
        totalValueOfStock();
    }
    public int accountBalance(int balance){
        System.out.println("Current balance is:"+balance);
        StockPortfolio.value=balance;
        return balance;
    }
    public void debit(int bal) {
        int currentBalance = bal;
        System.out.println("Which stock you want to buy");
        String shareName = sc.next();
        System.out.println("how many share you want to buy");
        int noOfShare = sc.nextInt();
        System.out.println("price of each share");
        int sharePrice = sc.nextInt();
        Stock stock = new Stock(shareName, noOfShare, sharePrice);
        int debit = stock.getNoOfShare() * stock.getSharePrice();
        if (debit < currentBalance) {
        	Linkedlist.add(stock);
             currentBalance = currentBalance - debit;
             accountBalance(currentBalance);
         }
        else{
             System.out.println("Account balance less than debit amt requested");
            }
    }
    public void particularStock(){
        if (Linkedlist.size() > 0) {
            for (int i = 0; i < Linkedlist.size(); i++) {
                Stock stock = Linkedlist.get(i);
                System.out.println("Person has " + stock.getShareName() + "'s " + stock.getNoOfShare() + " shares,each share of " + stock.getSharePrice());
            }
        }
    }
    public void valOfStock(){
        System.out.println("Which stock's total price you want to know");
        int indexOfStock = sc.nextInt();
        if(indexOfStock < Linkedlist.size()) {
            Stock stock = Linkedlist.get(indexOfStock);
            int totalValue = stock.getSharePrice() * stock.getNoOfShare();
            System.out.println("Person has " + stock.getShareName() + "companies share of total worth of " + totalValue + " rupees");
        }
        else{
            System.err.println("Enter correct input");
        }
    }
    public void totalValueOfStock() {
        int totalCollection = 0;
        if (Linkedlist.size() > 0){
            for (int i = 0; i < Linkedlist.size(); i++) {
                Stock stock = Linkedlist.get(i);
                totalCollection = totalCollection + stock.getNoOfShare() * stock.getSharePrice();
            }
        System.out.println("Person has Total collection of share of price " + totalCollection + " rupees");
         }
        else{
            System.err.println("No share info available");
        }
    }
}

	