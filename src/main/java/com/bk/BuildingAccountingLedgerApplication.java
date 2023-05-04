package com.bk;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;

//Create a CLI application.
//Track all financial transactions for business or for personal use.

public class BuildingAccountingLedgerApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
           String userInput;

           do {
               System.out.println("== BuildingAccountingLedgerApplication ==");
               System.out.println("D) Add Deposit");
               System.out.println("P) Make a payment (Debit)");
               System.out.println("R) Reports");
               System.out.println("X) Exit");
               System.out.print("Enter option: ");
               userInput = scanner.nextLine();

               while (true) {
                   private static void displayOptions displayOptions();
                   String option = input.nextLine().toUpperCase();
                   switch (option) {
                       case "D":
                           addDeposit(transactions);
                           break;
                       case "P":
                           makePayment(transactions);
                           break;
                       case "L":
                           viewLedger(transactions);
                           break;
                       case "R":
                           runReports(transactions);
                           break;
                       case "X":
                           input.close();
                           System.exit(0);
                           break;
                       default:
                           System.out.println("Invalid option. Please try again.");


                           () {
                       }

    private static void displayOptions() {
    }