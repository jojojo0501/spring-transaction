package com.example.TransactionSample.repository;

import com.example.TransactionSample.model.Task;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepository {
    private final JdbcTemplate jdbcTemplate;

    public TransactionRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insert(Task task){
        jdbcTemplate.update("insert into task(id,title,content) values (?,?,?)",
                task.getId(),task.getTitle(),task.getContent());
    }

}
