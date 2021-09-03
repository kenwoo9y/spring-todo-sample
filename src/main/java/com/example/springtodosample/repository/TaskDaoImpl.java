package com.example.springtodosample.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        String sql = "SELECT task_id, user_id, title, detail, deadline FROM task";

        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);

        List<Task> taskList = new ArrayList<Task>();

        for(Map<String, Object> result: resultList) {
            Task task = new Task();
            task.setTaskId((int)result.get("taskId"));
            task.setUserId((int)result.get("userId"));
            task.setTitle((String)result.get("title"));
            task.setDetail((String)result.get("detail"));
            task.setDeadline((String)result.get("deadline"));

            taskList.add(task);
        }

        return taskList;
    }

    @Override
    public Optional<Task> findById(int id) {
        String sql = "SELECT task_id, user_id, title, detail, deadline FROM task WHERE task_id = ?";

        Map<String, Object> result = jdbcTemplate.queryForMap(sql, id);

        Task task = new Task();
        task.setTaskId((int)result.get("taskId"));
        task.setUserId((int)result.get("userId"));
        task.setTitle((String)result.get("title"));
        task.setDetail((String)result.get("detail"));
        task.setDeadline((String)result.get("deadline"));

        Optional<Task> taskOptional = Optional.ofNullable(task);

        return taskOptional;
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
