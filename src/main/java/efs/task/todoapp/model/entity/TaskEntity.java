package efs.task.todoapp.model.entity;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class TaskEntity {
    private UUID id;
    private String description;
    private String due;
    private String createdBy;
}
