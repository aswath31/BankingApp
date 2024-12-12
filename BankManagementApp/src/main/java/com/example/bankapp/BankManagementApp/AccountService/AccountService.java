package com.example.bankapp.BankManagementApp.AccountService;

import com.example.bankapp.BankManagementApp.Entity.Account;

import java.util.List;

public interface AccountService {
    public Account createAccount(Account account);
    public Account getAccountDertailsByAccountNumber(Long accountNumber);
    public List<Account> getAllAccountDetails();

    public Account depositAmount(Long accontNumber, Account account);
    public Account withdrawAmount(Long accontNumber, Account account);
    public void closeAccount(Long accountNumber);

}
