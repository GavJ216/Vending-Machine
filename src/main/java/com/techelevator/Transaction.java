package com.techelevator;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
// output/format for sales log =  " currentDate + currentTime + AM/PM + transactionType ( feed / name of item+location / give change)
    // amount deposited/spent/change + amount of new balance post-prior-change.



    // Properties
    private SimpleDateFormat dateTime = new SimpleDateFormat("MM/dd/yyyy hh.mm.ss aa");
    private String transactionType;
    private double currentBalance;
    private Product dispensedItem;
    private String currentTime = dateTime.format(new Date()).toString();
    double fedMoney;




    // Constructors
        public Transaction (Product dispensedItem){
            this.currentTime = currentTime;
            this.dispensedItem = dispensedItem;
            this.currentBalance = currentBalance;
        }


    // G&S

    // Methods

    //



    public void feedMoney (double fedMoney){
                 //receives a double and adds it to the currentBalance.
                // returns current balance with fed money added.
                // write a line to account for the change in stock.

        currentBalance = currentBalance + fedMoney;

    }

    public void dispenseTransaction (Product product){

    }

    /* todo - write three methods for individual transactions
    1- feed money transaction method : write to file saying : Date, Time, AM/PM, "FEED MONEY:", Initial balance, post change balance.
    2- dispense product method:  Date, Time, AM/PM, "itemName + location", Initial balance, post change balance.
    3- give change method Date, Time, AM/PM, "GIVE CHANGE", Initial balance, post change balance ( WHICH SHOULD BE ZERO AFTER )

    */

}
