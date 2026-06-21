package com.example.demo.automation.infrastructure.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import com.example.demo.automation.domain.entities.ScheduledPost.PostStatus;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.EnumType;
import java.time.LocalDateTime;
import jakarta.persistence.FetchType;

@Entity
@Table(name = "schedule_post")
@Data
@NoArgsConstructor
public class SchedulePostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idPost;

    @Column(unique = true, name = "idPost", columnDefinition = "TEXT")
    private String videoPath;
    @Column(name = "caption")
    private String caption;
    private String affiliateLink;

    @Enumerated(EnumType.STRING)
    private PostStatus status;
    private LocalDateTime scheduledTime;
    private LocalDateTime executedAt;

    @Column(columnDefinition = "TEXT", name = "failure_reason")
    private String failureReason;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tiktok_account_id")
    private TiktokAccountEntity tiktokAccount;

}
