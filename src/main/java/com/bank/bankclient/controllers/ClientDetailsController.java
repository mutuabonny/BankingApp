/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.controllers;

import com.bank.bankclient.datalayer.ClientDetails;
import com.bank.bankclient.requests.ClientDetailsRequest;
import com.bank.bankclient.services.ClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
public class ClientDetailsController {

    @Autowired
    private ClientDetailsService cservice;

    @PostMapping("/createClient")
    public ClientDetails createClient(@RequestBody ClientDetailsRequest clientDetailsRequest) {

        return cservice.createClient(clientDetailsRequest);

    }
}
