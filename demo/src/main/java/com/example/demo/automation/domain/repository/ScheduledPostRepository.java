package com.example.demo.automation.domain.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.time.LocalDateTime;

import com.example.demo.automation.domain.entities.ScheduledPost;

public interface ScheduledPostRepository {
    ScheduledPost save(ScheduledPost post);

    Optional<ScheduledPost> findById(UUID idPost);

    List<ScheduledPost> findAllByStatusAndScheduledTimeBefore(String status, LocalDateTime time);

}
