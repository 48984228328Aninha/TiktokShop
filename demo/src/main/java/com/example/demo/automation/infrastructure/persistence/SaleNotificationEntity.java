package com.example.demo.automation.infrastructure.persistence;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "sale_notifications")
@NoArgsConstructor
@AllArgsConstructor
public class SaleNotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idSale;

    @Column(unique = true, nullable = false)
    private String externalOrderId;
    private BigDecimal salesAmount;
    private BigDecimal comissionAmount;
    private String productName;
    private String buyerUsername;
    private LocalDateTime saleDate;
    private boolean notified;

}
