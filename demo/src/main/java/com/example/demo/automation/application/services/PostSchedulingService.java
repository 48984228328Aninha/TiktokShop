package com.example.demo.automation.application.services;

import java.time.LocalDateTime;

import com.example.demo.automation.domain.entities.ScheduledPost;
import com.example.demo.automation.domain.entities.ScheduledPost.PostStatus;
import com.example.demo.automation.domain.valueobjects.AffiliateLink;

public class PostSchedulingService {
    public ScheduledPost validateAndPrepare(String videoPath, String caption, String affiliateLink,
            LocalDateTime scheduledTime, String tiktokAccountId) {
        AffiliateLink link = new AffiliateLink(affiliateLink);

        if (scheduledTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("Não é possível agendar posts em uma data passada");
        }

        return ScheduledPost.builder()
                .videoPath(videoPath)
                .caption(caption)
                .affiliateLink(affiliateLink)
                .scheduledTime(scheduledTime)
                .status(PostStatus.PENDING)
                .tiktokAccountId(tiktokAccountId)
                .build();

    }

}
