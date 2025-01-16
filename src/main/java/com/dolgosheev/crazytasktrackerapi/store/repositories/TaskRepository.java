package com.dolgosheev.crazytasktrackerapi.store.repositories;

import com.dolgosheev.crazytasktrackerapi.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
