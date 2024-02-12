package transaction;

import account.Account;

import java.util.Date;

public class Transaction {
    //Declare transaction details
    private int transactionId;
    private Date date;
    private double amount;
    private String description;
    private Account sourceAccount; //the account from which money was withdrawn
    private Account targetAccount; //the account to which the money was deposited

    //Adding constructor

    public Transaction(int transactionId,
                       Date date,
                       double amount,
                       String description,
                       Account sourceAccount,
                       Account targetAccount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.description = description;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }

    //Getter and Setter
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(Account sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public Account getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(Account targetAccount) {
        this.targetAccount = targetAccount;
    }
}
