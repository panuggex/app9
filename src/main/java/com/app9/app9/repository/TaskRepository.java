package com.app9.app9.repository;

import com.app9.app9.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Iterable<Task> findByUserId(long userId);
}
