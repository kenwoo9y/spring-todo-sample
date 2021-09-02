package com.example.springtodosample.repository;

import java.util.List;
import java.util.Optional;

import com.example.springtodosample.entity.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDaoImpl implements TaskDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TaskDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Task> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Task> findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void insert(Task task) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int update(Task task) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int deleteById(int id) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
