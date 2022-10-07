/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bank.bankclient.services;

import com.bank.bankclient.datalayer.ClientDetails;
import com.bank.bankclient.repositories.ClientDetailsRepository;
import com.bank.bankclient.requests.ClientDetailsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
@Service
public class ClientDetailsService {

    @Autowired
    private ClientDetailsRepository clientDetailsRepository;

    public ClientDetails createClient(ClientDetailsRequest clientDetailsRequest) {
        ClientDetails details = new ClientDetails();
        details.setEmailAddres(clientDetailsRequest.getEmailAddres());
        details.setFirstName(clientDetailsRequest.getFirstName());
        details.setSecondName(clientDetailsRequest.getSecondName());
        details.setSurName(clientDetailsRequest.getSurName());
        details.setIdNumber(clientDetailsRequest.getIdNumber());
        details.setKraPin(clientDetailsRequest.getKraPin());
        details.setPhoneNumber(clientDetailsRequest.getPhoneNumber());

        return clientDetailsRepository.save(details);

    }

}
