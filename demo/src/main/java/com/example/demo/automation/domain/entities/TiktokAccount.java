package com.example.demo.automation.domain.entities;

import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class TiktokAccount {
    private UUID idAccount;
    private String username;
    private String encryptedPassword;
    private String sessionCookie;
    private String userAgent;
    private String proxyAgent;
    private LocalDateTime lastLoginAt;
}
