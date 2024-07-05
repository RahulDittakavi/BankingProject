package com.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, accountHolderName, initialDeposit);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void listAccounts() {
        for (Account account : accounts.values()) {
            System.out.println("Account Number: " + account.getAccountNumber() +
                    ", Account Holder: " + account.getAccountHolderName() +
                    ", Balance: " + account.getBalance());
        }
    }
}
