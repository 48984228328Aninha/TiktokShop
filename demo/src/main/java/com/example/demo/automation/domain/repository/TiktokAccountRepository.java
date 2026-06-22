package com.example.demo.automation.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.example.demo.automation.domain.entities.TiktokAccount;

public interface TiktokAccountRepository {
    TiktokAccount save(TiktokAccount tiktokAccount);

    Optional<TiktokAccount> findById(UUID idAccount);
}
