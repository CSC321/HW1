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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class that stores information on accounts
 * 
 * @author kdb05506
 * @version August 2018
 */
public class AccountLookup {
    
    private ArrayList<Account> accounts;
    private String fileName;
    
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
            while (infile.hasNextLine()) {
                String accountNumber = infile.nextLine().trim();
                Account newAccount = new Account(accountNumber);
                System.out.println(newAccount.getAccountNumber());
            }
            infile.close();
            return "Try loop";
               
        } catch (FileNotFoundException ex) {
            return "No such file: " + fileName;
        }
    }
    
}
