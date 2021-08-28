package com.example.springtodosample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task {
    private int taskId;
    private int userId;
    private String title;
    private String detail;
    private String deadline;
}
