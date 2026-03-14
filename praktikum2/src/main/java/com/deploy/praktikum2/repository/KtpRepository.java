package com.deploy.praktikum2.repository;

import com.deploy.praktikum2.model.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface KtpRepository {
    boolean existsByNomorKtp(String nomorktp);
}
