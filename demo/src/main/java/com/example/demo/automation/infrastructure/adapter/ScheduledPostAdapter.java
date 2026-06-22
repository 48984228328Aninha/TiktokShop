package com.example.demo.automation.infrastructure.adapter;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.automation.domain.entities.ScheduledPost;
import com.example.demo.automation.domain.repository.ScheduledPostRepository;
import com.example.demo.automation.infrastructure.mapper.PostEntityMapper;
import com.example.demo.automation.infrastructure.persistence.SchedulePostEntity;
import com.example.demo.automation.infrastructure.repositories.JpaScheduledPostRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ScheduledPostAdapter implements ScheduledPostRepository {
    private final JpaScheduledPostRepository jpaRepository;
    private final PostEntityMapper mapper;

    @Override
    public Optional<ScheduledPost> findById(UUID id) {
        SchedulePostEntity entity = mapper
    }

}
