/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.controllers;

import com.bank.bankclient.datalayer.BankAccount;
import com.bank.bankclient.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author USER
 */
@Controller
public class bankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/saveBankAccountDetails")
    public BankAccount saveBankAccountDetails(@RequestBody BankAccount baccount) {

        return bankAccountService.saveBankAccountDetails(baccount);
    }

}
