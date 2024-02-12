import account.Account;
import bank.Bank;
import transaction.Transaction;
import user.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            List<Account> accounts = new ArrayList<>();
            List<Transaction> transactions = new ArrayList<>();

            //Creating an instance of Bank class
            Bank bank = new Bank("Almond Bank", accounts, transactions);

            User user1 = new User(1, "lollipop12", "newman69&*", "Alvin Gregory", "alvinguy08@gmail.com", accounts);
            User user2 = new User(2, "landlord", "skyrocket02", "Olamide Banks", "olabanks08@gmail.com", accounts);
            User user3 = new User(3, "new_state01", "waytogo", "Cynthia Fasola", "cynthiaf@yahoo.com", accounts);

            System.out.println("**USER1 DETAILS**");
            System.out.println("User Id: " + user1.getUserId());
            System.out.println("Username: " + user1.getUsername());
            System.out.println("Full Names: " + user1.getFullName());
            System.out.println("Email Address: " + user1.getEmail());
            System.out.println();

            System.out.println("**USER2 DETAILS**");
            System.out.println("User Id: " + user2.getUserId());
            System.out.println("Username: " + user2.getUsername());
            System.out.println("Full Names: " + user2.getFullName());
            System.out.println("Email Address: " + user2.getEmail());
            System.out.println();

            System.out.println("**USER3 DETAILS**");
            System.out.println("User Id: " + user3.getUserId());
            System.out.println("Username: " + user3.getUsername());
            System.out.println("Full Names: " + user3.getFullName());
            System.out.println("Email Address: " + user3.getEmail());
            System.out.println();

            Account account1 = new Account(101, "A0267484", 2000.0, user1);
            Account account2 = new Account(102, "A0367484", 1000.0, user2);
            Account account3 = new Account(103, "A0467484", 800.0, user3);

            Date transactionDate = new Date();
            Transaction transaction1 = new Transaction(1, transactionDate, 500.0, "Payment", account1, account2);

            //Add accounts and transactions to the bank
            bank.addAccount(account1);
            bank.addAccount(account2);
            bank.addAccount(account3);
            bank.addTransaction(transaction1);


            // Displaying bank information
            System.out.println("Bank Name: " + bank.getName());
            System.out.println("Bank Accounts: ");
            for (Account acc : bank.getAccounts()) {
                System.out.println("Account ID: " + acc.getAccountId() + ", Balance: $" + acc.getAccountBalance());
            }
            System.out.println("Bank Transactions: ");
            for (Transaction txn : bank.getTransactions()) {
                System.out.println("Transaction ID: " + txn.getTransactionId() + ", Amount: $" + txn.getAmount() + ", Date: " + txn.getDate());
            }
        } catch (Exception e){
            System.out.println("oops! something went wrong.");
        }
    }
    }
