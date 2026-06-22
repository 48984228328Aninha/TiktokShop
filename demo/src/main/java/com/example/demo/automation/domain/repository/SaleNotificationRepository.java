package com.example.demo.automation.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.example.demo.automation.domain.entities.SaleNotification;

public interface SaleNotificationRepository {
    SaleNotification save(SaleNotification sale);

    Optional<SaleNotification> findById(UUID idNotification);

}
