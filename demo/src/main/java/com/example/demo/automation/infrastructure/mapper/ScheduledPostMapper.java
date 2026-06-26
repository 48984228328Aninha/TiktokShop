package com.example.demo.automation.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.automation.domain.entities.ScheduledPost;
import com.example.demo.automation.infrastructure.persistence.SchedulePostEntity;

@Component
public class ScheduledPostMapper {
    public SchedulePostEntity toEntity(ScheduledPost postDomain) {
        if (postDomain == null) {
            return null;
        }

        SchedulePostEntity scheduleEntity = new SchedulePostEntity();
        scheduleEntity.setIdPost(postDomain.getIdPost());
        scheduleEntity.setVideoPath(postDomain.getVideoPath());
        scheduleEntity.setCaption(postDomain.getCaption());
        scheduleEntity.setAffiliateLink(postDomain.getAffiliateLink());
        scheduleEntity.setStatus(postDomain.getStatus());
        scheduleEntity.setScheduledTime(postDomain.getScheduledTime());
        scheduleEntity.setExecutedAt(postDomain.getExecutedAt());
        scheduleEntity.setFailureReason(postDomain.getFailureReason());

        return scheduleEntity;
    }

    public ScheduledPost toDomain(SchedulePostEntity entity) {
        if (entity == null) {
            return null;
        }

        return ScheduledPost.builder()
                .idPost(entity.getIdPost())
                .videoPath(entity.getVideoPath())
                .caption(entity.getCaption())
                .affiliateLink(entity.getAffiliateLink())
                .status(entity.getStatus())
                .scheduledTime(entity.getScheduledTime())
                .executedAt(entity.getExecutedAt())
                .failureReason(entity.getFailureReason())
                .tiktokAccountId(entity.getIdPost())
                .build();

    }
}
