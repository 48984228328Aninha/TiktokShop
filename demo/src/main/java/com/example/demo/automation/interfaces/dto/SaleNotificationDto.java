package com.example.demo.automation.interfaces.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleNotificationDto {
    private String productName;
    private String buyerName;
    private String saleAmount;
    private String comissionAmount;

}
