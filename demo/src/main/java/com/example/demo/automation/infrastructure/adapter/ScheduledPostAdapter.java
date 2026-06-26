package com.example.demo.automation.infrastructure.adapter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.demo.automation.domain.entities.ScheduledPost;
import com.example.demo.automation.domain.repository.ScheduledPostRepository;
import com.example.demo.automation.infrastructure.mapper.ScheduledPostMapper;
import com.example.demo.automation.infrastructure.persistence.SchedulePostEntity;
import com.example.demo.automation.infrastructure.persistence.TiktokAccountEntity;
import com.example.demo.automation.infrastructure.repositories.JpaScheduledPostRepository;
import com.example.demo.automation.infrastructure.repositories.JpaTiktokAccountRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class ScheduledPostAdapter implements ScheduledPostRepository {
    private final JpaScheduledPostRepository postRepository;
    private final JpaTiktokAccountRepository accountRepository;
    private final ScheduledPostMapper postMapper;

    @Override
    public ScheduledPost save(ScheduledPost domainPost) {
        SchedulePostEntity postEntity = postMapper.toEntity(domainPost);

        if (domainPost.getTiktokAccountId() != null) {
            UUID accountId = domainPost.getTiktokAccountId();
            TiktokAccountEntity accountEntity = accountRepository.findById(accountId)
                    .orElseThrow(() -> new RuntimeException("Não foi possível achar a conta" + accountId));

            postEntity.setTiktokAccount(accountEntity);
        }

        SchedulePostEntity savedEntity = postRepository.save(postEntity);
        return postMapper.toDomain(savedEntity);

    }

    @Override
    public Optional<ScheduledPost> findById(UUID idPost) {
        Optional<SchedulePostEntity> optionalEntity = postRepository.findById(idPost);
        return optionalEntity.map(postMapper::toDomain);
    }

    @Override
    public List<ScheduledPost> findAllByStatusAndScheduledTimeBefore(String status, LocalDateTime time) {
        List<SchedulePostEntity> entities = postRepository.findAllByStatusAndScheduledTimeBefore(status, time);

        return entities.stream()
                .map(postMapper::toDomain)
                .collect(Collectors.toList());
    }

}
