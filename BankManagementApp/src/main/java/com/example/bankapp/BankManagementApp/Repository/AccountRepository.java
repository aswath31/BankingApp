package com.example.bankapp.BankManagementApp.Repository;

import com.example.bankapp.BankManagementApp.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
