package com.example.demo.automation.domain.entities;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ScheduledPost {
    private UUID idSale;
    private String videoPath;
    private String caption;
    private String affiliateLink;
    private PostStatus status;
    private LocalDateTime scheduledTime;
    private LocalDateTime executedAt;
    private String failureReason;
    private UUID tiktokAccountId;

    public enum PostStatus {
        PENDING,
        POSTED,
        PROCESSING,
        FAILED
    }
}
