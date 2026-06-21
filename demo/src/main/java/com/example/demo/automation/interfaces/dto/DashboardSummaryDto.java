package com.example.demo.automation.interfaces.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DashboardSummaryDto {
    private int totalScheduledPosts;
    private int pendingPosts;
    private int orders;
    private int receitaTotal;
    private int ticketMedio;
    private Double conversionRate;

}
