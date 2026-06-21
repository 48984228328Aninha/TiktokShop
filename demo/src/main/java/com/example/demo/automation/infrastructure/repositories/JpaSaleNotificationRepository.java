package com.example.demo.automation.infrastructure.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.automation.infrastructure.persistence.SaleNotificationEntity;

public interface JpaSaleNotificationRepository extends JpaRepository<SaleNotificationEntity, UUID> {

}
