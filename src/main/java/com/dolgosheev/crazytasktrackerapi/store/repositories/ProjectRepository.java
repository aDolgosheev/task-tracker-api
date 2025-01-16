package com.dolgosheev.crazytasktrackerapi.store.repositories;

import com.dolgosheev.crazytasktrackerapi.store.entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
