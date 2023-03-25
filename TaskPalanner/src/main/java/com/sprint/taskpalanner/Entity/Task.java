package com.sprint.taskpalanner.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer taskId;
    private String name;
    private String description;
    private String type;
    private String status;
    private String assignee;
    private String creationDate;
    @ManyToOne
    private Sprint sprint;
}
