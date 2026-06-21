package com.example.demo.automation.infrastructure.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "tiktok_accounts")
@Data
@NoArgsConstructor
public class TiktokAccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, name = "username", nullable = false)
    private String username;
    private String encryptedPassword;

    @Column(name = "session_cookie")
    private String sessionCookie;
    private String userAgent;
    private String proxyAgent;
    private boolean isActive;
    private LocalDateTime lastLoginAt;

}
