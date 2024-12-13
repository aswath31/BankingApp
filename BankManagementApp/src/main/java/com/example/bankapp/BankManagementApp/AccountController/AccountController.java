package com.example.bankapp.BankManagementApp.AccountController;

import com.example.bankapp.BankManagementApp.AccountService.AccountService;
import com.example.bankapp.BankManagementApp.Entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService service;

    @PostMapping("/createAccount")
    private ResponseEntity<Account> cerateAccount(@RequestBody Account account) {
        Account createAccount = service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);
    }


    @GetMapping("/{accountNumber}")
    private Account getAccountDetailsByAccountNumber(@PathVariable Long accountNumber) {
        Account getAccount = service.getAccountDetailsByAccountNumber(accountNumber);
        return getAccount;
    }

    @GetMapping("/allAccountDetails")
    private List<Account> getAllAccountDetails(){
        List<Account> allAccountDetails = service.getAllAccountDetails();
        return allAccountDetails;

    }

    @PutMapping("/deposit/{accountNumber}/{amount}")
    private Account depositAmount(@PathVariable Long accountNumber,@PathVariable Double amount){
        Account depositAmount = service.depositAmount(accountNumber,amount);
        return depositAmount;
    }

    @PutMapping("/withdraw/{accountNumber}/{amount}")
    private Account withdrawAmount(@PathVariable Long accountNumber,@PathVariable Double amount){
        Account withdrawAmount = service.withdrawAmount(accountNumber,amount);
        return withdrawAmount;
    }

}