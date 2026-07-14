package za.ac.cput;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String password;
    private double balance;
    private List<String> transactionHistory;

    public User(String userId, String password, double balance) {
        this.userId = userId;
        this.password = password;
        this.balance = balance;
        this.transactionHistory = new ArrayList<String>();
    }

    public String getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }
    public double getBalance() {
        return balance;
    }

    //Here we update after deposit or withdraw or transfer
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Add transaction to history
    public void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    //Show all transactions that have been made
    public void showTransactionHistory() {
        if(transactionHistory.isEmpty()) {
            System.out.println("No transactions have been made as yet.");
        }else {
            System.out.println("Transaction History:");
            for(String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}
