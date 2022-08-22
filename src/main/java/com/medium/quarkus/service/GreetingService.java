package com.medium.quarkus.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        return "Hello " + name + " from RESTEasy Reactive - Hot Reload capability";
    }

}
