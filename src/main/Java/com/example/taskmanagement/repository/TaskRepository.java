
package com.example.taskmanagement.repository;

import com.example.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * A repository interface for Task, extending JpaRepository.
 * Spring Data JPA will automatically provide CRUD operations for the Task entity.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
