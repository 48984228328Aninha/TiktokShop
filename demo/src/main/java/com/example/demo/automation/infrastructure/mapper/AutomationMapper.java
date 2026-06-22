package com.example.demo.automation.infrastructure.mapper;

import com.example.demo.automation.domain.entities.ScheduledPost;
import com.example.demo.automation.domain.entities.TiktokAccount;
import com.example.demo.automation.interfaces.dto.PythonExecutionRequestDto;

public class AutomationMapper {

    public PythonExecutionRequestDto toPythonRequest(ScheduledPost post, TiktokAccount tiktokAccount) {
        return PythonExecutionRequestDto.builder()
                .action("POST_VIDEO")
                .tiktokUsername(tiktokAccount.getUsername())
                .sessionCookie(tiktokAccount.getSessionCookie())
                .proxy(tiktokAccount.getProxyAgent())
                .userAgent(tiktokAccount.getUserAgent())
                .videoFilePath(post.getVideoPath())
                .caption(post.getCaption())
                .affiliateLink(post.getAffiliateLink())
                .build();
    }

}
