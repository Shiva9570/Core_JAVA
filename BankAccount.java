package com.studyopedia;

class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;
    //  Creating Default constructor
    public BankAccount() {
        this.accountHolderName = "Default Name";
        this.accountNumber = "000000";
        this.accountType = "Savings";
        this.balance = 1000.0; // Default initial balance
    }

    // Creating Parameterized constructor
    public BankAccount(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

//    public String getAccountHolderName() {
//        return accountHolderName;
//    }
//
//    public void setAccountHolderName(String accountHolderName) {
//        this.accountHolderName = accountHolderName;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(String accountType) {
//        this.accountType = accountType;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

    // Displaying account details
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        // Creating  a default account
        BankAccount defaultAccount = new BankAccount();
        System.out.println("Default Account:");
        defaultAccount.displayAccountDetails();

        // Creating a custom account
        BankAccount customAccount = new BankAccount("Shibendra mishra", "8207324972", "Saving", 50000.0);
        System.out.println("\nCustom Account:");
        customAccount.displayAccountDetails();
    }
}

