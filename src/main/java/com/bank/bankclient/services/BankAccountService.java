/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.services;

import com.bank.bankclient.datalayer.BankAccount;
import com.bank.bankclient.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class BankAccountService {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public BankAccount saveBankAccountDetails(BankAccount bankAccount) {
        return bankAccountRepository.save(bankAccount);
    }
}
