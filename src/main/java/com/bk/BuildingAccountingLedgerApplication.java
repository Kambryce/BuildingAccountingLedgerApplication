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

               switch (userInput.toUpperCase()) {
                   case "D":
                       // TODO: Add deposit functionality
                       break;
                   case "P":
                       // TODO: Make payment functionality
                       break;
                   case "R":
                       //TODO: Reports Functionality
                       break;
                   case "X":
                       System.out.println("Exitng Financial Tracker...");
                       break;
                   default:
                       System.out.println("Invalid option, please try again.");

                   case
               }
           } while(!userInput.equalsIgnoreCase("X"));
    }
}


