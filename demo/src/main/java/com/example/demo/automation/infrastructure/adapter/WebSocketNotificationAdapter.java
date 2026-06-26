package com.example.demo.automation.infrastructure.adapter;

import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.example.demo.automation.application.services.NotificationService;
import com.example.demo.automation.domain.entities.SaleNotification;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebSocketNotificationAdapter implements NotificationService {
    private final SimpMessagingTemplate messagingTemplate;

    @Override
    public void notifyNewSale(SaleNotification sale) {
        log.info("Nova venda detectada. Produto: {}, Valor: {}", sale.getProductName(), sale.getSaleAmount());
    }

}
