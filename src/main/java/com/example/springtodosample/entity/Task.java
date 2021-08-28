package com.example.springtodosample.entity;

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
