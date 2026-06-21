package com.example.demo.automation.interfaces.dto;

import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class RecentSaleDto {
    private String productName;
    private String saleAmount;
    private BigDecimal commissionAmount;
    private LocalDateTime saleDate;
    private String buyerName;

}
