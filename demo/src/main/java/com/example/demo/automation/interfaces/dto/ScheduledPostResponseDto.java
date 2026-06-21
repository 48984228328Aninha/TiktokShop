package com.example.demo.automation.interfaces.dto;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class ScheduledPostResponseDto {
    private UUID idPost;
    private String message;
    private LocalDateTime scheduledTime;
}
