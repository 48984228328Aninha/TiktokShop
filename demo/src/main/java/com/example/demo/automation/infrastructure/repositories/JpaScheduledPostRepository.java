package com.example.demo.automation.infrastructure.repositories;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.automation.infrastructure.persistence.SchedulePostEntity;

public interface JpaScheduledPostRepository extends JpaRepository<SchedulePostEntity, UUID> {

    List<SchedulePostEntity> findAllByStatusAndScheduledTimeBefore(String status, LocalDateTime time);
}
