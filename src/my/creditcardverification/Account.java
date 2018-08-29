/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.creditcardverification;

/**
 * Class that stores account numbers
 * 
 * @author kdb05506
 * @version August 2018
 */
public class Account {
    
    private String accountNumber;
    
    /**
     * Constructor for objects of class Account
     * 
     * @param accountNumber 
     * @param isValid 
     */
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    /**
     * Accessor method to return account number
     * 
     * @return accountNumber
     */
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
}
