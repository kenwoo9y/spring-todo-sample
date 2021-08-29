package com.example.springtodosample.repository;

import java.util.List;
import java.util.Optional;

import com.example.springtodosample.entity.Task;

public interface TaskDao {
    
    List<Task> findAll();

    Optional<Task> findById(int id);

    void insert(Task task);

    int update(Task task);

    int deleteById(int id);
    
}
