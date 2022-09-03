package com.example.TransactionSample.service;

import com.example.TransactionSample.model.Task;
import com.example.TransactionSample.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository repository;

    private static List<Task> taskList = new ArrayList<>();

    @Transactional
    public void addTask() {
        for (Task task : taskList) {
            repository.insert(task);
        }
    }

    public void createTask() {
        int max = 10;
        for (int i = 0; i < max; i++) {
            String num = String.valueOf(i + 1);
            taskList.add(new Task(num, "title:" + num, "content:" + num));
        }
    }
}
