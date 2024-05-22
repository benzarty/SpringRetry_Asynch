package com.example.springretry_asynch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

    @Autowired
    private EmailService emailService;

    public void purchase() {
        emailService.sendEmail();
    }
}
