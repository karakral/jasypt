package com.karakral.jasypt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Value("${app.name}")
    private String appName;

    @Value("${app.api.version}")
    private String apiVersion;

    @Value("${customer.username}")
    private String username;

    public void printConfiguration() {
        System.out.println("App Name: " + appName);
        System.out.println("API Version: " + apiVersion);
        System.out.println("User name: " + username);

    }
}