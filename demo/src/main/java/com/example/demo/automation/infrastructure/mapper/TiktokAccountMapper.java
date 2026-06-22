package com.example.demo.automation.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.automation.domain.entities.TiktokAccount;
import com.example.demo.automation.infrastructure.persistence.TiktokAccountEntity;

@Component
public class TiktokAccountMapper {
    public TiktokAccountEntity toEntity(TiktokAccount domain) {
        if (domain == null) {
            return null;
        }

        TiktokAccountEntity tiktokEntity = new TiktokAccountEntity();
        tiktokEntity.setId(domain.getIdAccount());
        tiktokEntity.setUsername(domain.getUsername());
        tiktokEntity.setEncryptedPassword(domain.getEncryptedPassword());
        tiktokEntity.setSessionCookie(domain.getSessionCookie());
        tiktokEntity.setUserAgent(domain.getUserAgent());
        tiktokEntity.setProxyAgent(domain.getProxyAgent());
        tiktokEntity.setLastLoginAt(domain.getLastLoginAt());

        return tiktokEntity;
    }

    public TiktokAccount toDomain(TiktokAccountEntity tiktokEntity) {
        if (tiktokEntity == null) {
            return null;
        }

        return TiktokAccount.builder()
                .idAccount(tiktokEntity.getId())
                .username(tiktokEntity.getUsername())
                .encryptedPassword(tiktokEntity.getEncryptedPassword())
                .sessionCookie(tiktokEntity.getSessionCookie())
                .userAgent(tiktokEntity.getUserAgent())
                .proxyAgent(tiktokEntity.getProxyAgent())
                .lastLoginAt(tiktokEntity.getLastLoginAt())
                .build();
    }
}
