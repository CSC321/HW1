/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.creditcardverification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that stores information on accounts
 * 
 * @author kdb05506
 * @version August 2018
 */
public class AccountLookup {
    
    private ArrayList<Account> accounts;
    
    /**
     * Constructor of an AccountLookup object with data from the specified file
     * 
     * @param fileName
     * @return result as string to GUI
     */
    public String accountLookup(String fileName) {
        this.accounts = new ArrayList<Account>();
        
        try {
            Scanner infile = new Scanner(new File(fileName));
            String output = "";
            while (infile.hasNextLine()) {
                String accountNumber = infile.nextLine().trim();
                Account newAccount = new Account(accountNumber);
                boolean isValid = newAccount.validate();
                String validity = "";
                if (isValid) {
                    validity = "VALID";
                } else {
                    validity = "NOT VALID";
                }
                this.accounts.add(newAccount);
                // TODO: new lines/formatting
                output = output + newAccount.getAccountNumber() + ": " + validity + " ";
            }
            infile.close();
            return output;
               
        } catch (FileNotFoundException ex) {
            return "No such file: " + fileName;
        }
    }
    
}
