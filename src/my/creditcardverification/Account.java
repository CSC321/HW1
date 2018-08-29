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
    
    /**
     * Mutator method that uses the Luhn formula to determine if a credit card number is valid
     * 
     * @param accountNumber
     * @return whether or not the account number is valid
     */
    public boolean validate() {
        // TODO: Strip spaces
        int counter = 1;
        int luhnValue = 0;
        for (int i=this.accountNumber.length()-1; i>=0; i--) {
            char c = this.accountNumber.charAt(i);
            if (Character.isDigit(c)) {
               int j = Character.getNumericValue(c); 
               if (counter%2==0) {
                   j = 2*j;
                   if (String.valueOf(j).length()>1) {
                       j = j%10 + j/10;
                   }
               } 
               luhnValue = luhnValue+j;
            } else {
                return false;
            }
            counter++;
        }
        // TODO: Check if last digit of luhn value is 0, return true/false as applicable
        // TODO: Remove print lines
        System.out.println(luhnValue);
        String validityCheck = String.valueOf(luhnValue);
        char d = validityCheck.charAt(validityCheck.length()-1);
        System.out.println(d);
        if (Character.getNumericValue(d)==0) {
            return true;
        } else {
            return false;
        }
    }
}
