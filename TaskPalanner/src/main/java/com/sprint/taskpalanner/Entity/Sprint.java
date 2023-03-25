package com.sprint.taskpalanner.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Sprint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sprintId;
    private String name;
    private Date createdDate;
    private Date endDate;
    @OneToMany(mappedBy = "sprint")
    private List<Task> tasks;
}
