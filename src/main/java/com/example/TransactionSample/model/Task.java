package com.example.TransactionSample.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {

    private String id;
    private String title;
    private String content;
}
