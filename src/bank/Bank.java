package bank;

import account.Account;
import transaction.Transaction;

import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;
    private List<Transaction> transactions;

    //Adding constructor

    public Bank(String name,
                List<Account> accounts,
                List<Transaction> transactions) {
        this.name = name;
        this.accounts = accounts;
        this.transactions = transactions;
    }

    //Getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    //Additional methods
    public void addAccount(Account account){
        accounts.add(account);
    }

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }
}
