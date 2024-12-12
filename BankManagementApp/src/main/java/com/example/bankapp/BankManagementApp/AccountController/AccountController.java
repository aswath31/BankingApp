package com.example.bankapp.BankManagementApp.AccountController;

import com.example.bankapp.BankManagementApp.AccountService.AccountService;
import com.example.bankapp.BankManagementApp.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService service;
    @PostMapping("/createAccount")
    private Account createAccount(@RequestBody Account account){
        Account createAccount  =  service.createAccount(account);
        return createAccount;
    }
}
