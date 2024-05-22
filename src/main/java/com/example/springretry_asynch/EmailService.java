package com.example.springretry_asynch;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Async("taskExecutorDefault")
    public void sendEmail() {
        try {
            // Simulate a long-running task
            Thread.sleep(5000); // 5 seconds delay
            System.out.println("Email sent!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
//can't call asynch method from another asynchronous method
//@Async and @Transcational don’t play well 5ater kol wa7da fi thread
//@Async methods do not throw exceptions to the calling thread. This means that you need to handle exceptions
// properly within the @Async method, or else they will be lost.
// Resilience4J kima spring retry ama more customisable , spring rety easy to implmeent
