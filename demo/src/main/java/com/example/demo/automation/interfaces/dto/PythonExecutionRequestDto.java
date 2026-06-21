package com.example.demo.automation.interfaces.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PythonExecutionRequestDto {
    private String action;
    private String tiktokUsername;
    private String tiktokPassword;
    private String sessionCookie;
    private String proxy;
    private String userAgent;
    private String videoFilePath;
    private String caption;
    private String affiliateLink;
}
