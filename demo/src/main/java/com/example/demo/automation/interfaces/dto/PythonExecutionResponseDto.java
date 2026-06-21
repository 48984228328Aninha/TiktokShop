package com.example.demo.automation.interfaces.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PythonExecutionResponseDto {
    private boolean success;
    private String errorMessage;
    private String sessionCookie;
    private String tiktokVideoId;
    private LocalDateTime postedAt;
}
