package com.example.bankapp.BankManagementApp.AccountController;

import com.example.bankapp.BankManagementApp.AccountService.AccountService;
import com.example.bankapp.BankManagementApp.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private ResponseEntity<Account> cerateAccount(@RequestBody Account account){
        Account createAccount  =  service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);
    }
}
