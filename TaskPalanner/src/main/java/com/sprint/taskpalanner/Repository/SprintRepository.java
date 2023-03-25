package com.sprint.taskpalanner.Repository;

import com.sprint.taskpalanner.Entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepository extends JpaRepository<Integer, Sprint> {
}
