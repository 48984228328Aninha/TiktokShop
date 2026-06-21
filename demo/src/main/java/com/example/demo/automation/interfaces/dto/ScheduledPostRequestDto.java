package com.example.demo.automation.interfaces.dto;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class ScheduledPostRequestDto {
    private String videoUrl;
    private String caption;
    private String affiliateLink;
    private LocalDateTime scheduledTime;
}
