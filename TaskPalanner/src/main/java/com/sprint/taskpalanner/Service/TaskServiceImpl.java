package com.sprint.taskpalanner.Service;

import com.sprint.taskpalanner.Entity.Task;
import com.sprint.taskpalanner.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task addTask(Task task) {
        return taskRepository.save(task);
    }

}
