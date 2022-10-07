/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.datalayer;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author USER
 */
@Data
@Entity
public class BankAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BankAccount_seq")
    @SequenceGenerator(name = "BankAccount_seq", initialValue = 1, allocationSize = 1, sequenceName = "BankAccount_seq")
    private long BankAccountid;
    private String accountName;
    private String accountType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfOpening;
    @ManyToOne
    @JoinColumn(name = "clientId")
    private ClientDetails details;

}
