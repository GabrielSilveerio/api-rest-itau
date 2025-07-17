package com.backend.itau.repository;

import com.backend.itau.model.TransacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<TransacaoModel, Long> {
}
