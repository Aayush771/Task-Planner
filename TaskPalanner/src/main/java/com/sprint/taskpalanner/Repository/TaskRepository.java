package com.sprint.taskpalanner.Repository;

import com.sprint.taskpalanner.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
