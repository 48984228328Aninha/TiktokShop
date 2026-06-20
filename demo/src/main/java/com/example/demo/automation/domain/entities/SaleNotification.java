package com.example.demo.automation.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaleNotification {
    private UUID idSale;
    private UUID externalOrderId;
    private BigDecimal saleAmount;
    private BigDecimal comissionAmount;
    private String productName;
    private String buyerName;
    private LocalDateTime saleDate;
    private boolean notified;

}
