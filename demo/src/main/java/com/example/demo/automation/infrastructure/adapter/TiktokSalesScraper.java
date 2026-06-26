package com.example.demo.automation.infrastructure.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.automation.domain.entities.SaleNotification;
//import com.example.demo.automation.infrastructure.mapper.AutomationMapper;
import com.example.demo.automation.interfaces.dto.PythonExecutionRequestDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class TiktokSalesScraper {
    private final RestTemplate restTemplate;
    // private final AutomationMapper automationMapper;

    @Value("${python.service.url}")
    private String pythonServiceUrl;

    public List<SaleNotification> fetchNewSales(String tiktokUsername) {
        try {
            PythonExecutionRequestDto requestDto = PythonExecutionRequestDto.builder()
                    .action("GET_SALES")
                    .tiktokUsername(tiktokUsername)
                    .build();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<PythonExecutionRequestDto> request = new HttpEntity<>(requestDto, headers);

            log.info("Buscando novas vendas para o usuário: {}", tiktokUsername);

            String reponse = restTemplate.postForObject(pythonServiceUrl + "/sales", request, String.class);

            log.info("Vendas buscadas com sucesso. Resposta bruta: {}", reponse);
            return new ArrayList<>();
        } catch (Exception e) {
            log.error("Erro ao buscar vendas", e);
            return new ArrayList<>();
        }
    }
}
