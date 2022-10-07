/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.datalayer;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class ClientDetails implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ClientDetails_seq")
    @SequenceGenerator(name = "ClientDetails_seq", initialValue = 1, allocationSize = 1, sequenceName = "ClientDetails_seq")
    private long clientId;
    private String firstName;
    private String secondName;
    private String surName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    private String emailAddres;
    private String idNumber;
    private String phoneNumber;
    private String kraPin;
    @OneToMany
    private List<BankAccount> accounts;

}
