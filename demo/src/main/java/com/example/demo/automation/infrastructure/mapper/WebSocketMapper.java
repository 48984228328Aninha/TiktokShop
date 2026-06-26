package com.example.demo.automation.infrastructure.mapper;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Component;

import com.example.demo.automation.domain.entities.SaleNotification;
import com.example.demo.automation.interfaces.dto.SaleNotificationDto;

@Component
public class WebSocketMapper {
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private static final NumberFormat MONEY_FORMATTER = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));

    public SaleNotificationDto toDto(SaleNotification sale) {
        if (sale == null) {
            return null;
        }
        return SaleNotificationDto.builder()
                .productName(sale.getProductName())
                .buyerName(sale.getBuyerName())
                .saleAmount(formatMoney(sale.getSaleAmount()))
                .comissionAmount(formatMoney(sale.getComissionAmount()))
                .saleDate(sale.getSaleDate() != null ? sale.getSaleDate().format(DATE_FORMATTER) : null)
                .build();
    }

    private String formatMoney(BigDecimal value) {
        if (value == null) {
            return "R$ 0,00";
        }

        return MONEY_FORMATTER.format(value);
    }
}
