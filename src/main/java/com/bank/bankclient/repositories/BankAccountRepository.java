/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.repositories;

import com.bank.bankclient.datalayer.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author USER
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

}
