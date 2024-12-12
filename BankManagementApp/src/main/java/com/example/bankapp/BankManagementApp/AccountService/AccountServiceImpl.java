package com.example.bankapp.BankManagementApp.AccountService;

import com.example.bankapp.BankManagementApp.Entity.Account;
import com.example.bankapp.BankManagementApp.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository repo;

    @Override
    public Account createAccount(Account account) {
        Account acc = repo.save(account);
        return acc;
    }

    @Override
    public Account getAccountDertailsByAccountNumber(Long accountNumber) {
        return null;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        return null;
    }

    @Override
    public Account depositAmount(Long accontNumber, Account account) {
        return null;
    }

    @Override
    public Account withdrawAmount(Long accontNumber, Account account) {
        return null;
    }

    @Override
    public void closeAccount(Long accountNumber) {

    }
}
