package com.example.TransactionSample.controller;

import com.example.TransactionSample.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping("/createTask")
    public void createTask() {
        service.createTask();
        service.addTask();
    }
}
