package com.example.bankapp.BankManagementApp.AccountService;

import com.example.bankapp.BankManagementApp.Entity.Account;
import com.example.bankapp.BankManagementApp.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Account getAccountDetailsByAccountNumber(Long accountNumber) {
        Optional<Account> account = repo.findById(accountNumber);
        if(account.isEmpty()){
           throw new RuntimeException("Account Not Found");
        }
        Account retirvedAccount = account.get();
        return retirvedAccount;
    }

    @Override
    public List<Account> getAllAccountDetails() {
        List<Account> allAccounts = repo.findAll();
        return allAccounts;
    }

    @Override
    public Account depositAmount(Long accountNumber, Double amount) {
        Optional<Account> account = repo.findById(accountNumber);
        if(account.isEmpty()){
            throw new RuntimeException("No such account present. Please recheck the account Number");
        }
        Account accountPresent = account.get();
        double addedAmount = accountPresent.getAccountBalance() + amount;
        accountPresent.setAccountBalance(addedAmount);
        Account insertedAmountInAccount = repo.save(accountPresent);
        return insertedAmountInAccount;
    }

    @Override
    public Account withdrawAmount(Long accountNumber, Double amount) {
        return null;
    }

    @Override
    public void closeAccount(Long accountNumber) {

    }
}
