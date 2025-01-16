package com.dolgosheev.crazytasktrackerapi.store.repositories;

import com.dolgosheev.crazytasktrackerapi.store.entities.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {
}
