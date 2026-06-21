package com.example.demo.automation.infrastructure.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.automation.infrastructure.persistence.TiktokAccountEntity;

public interface JpaTiktokAccountRepository extends JpaRepository<TiktokAccountEntity, UUID> {

}
