package com.example.demo.automation.interfaces.dto;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ScheduledPostItemDto {
    private UUID idPost;
    private String caption;
    private String status;
    private LocalDateTime scheduledTime;
    private String failureReason;

}
