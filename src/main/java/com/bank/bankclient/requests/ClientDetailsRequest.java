/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.requests;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author USER
 */
@Getter
@Setter
public class ClientDetailsRequest {

    private String firstName;
    private String secondName;
    private String surName;
    private String dob;
    private String emailAddres;
    private String idNumber;
    private String phoneNumber;
    private String kraPin;
}
