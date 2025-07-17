package com.backend.itau.service;

import com.backend.itau.dto.TransacaoDTO;
import com.backend.itau.mapper.TransacaoMapper;
import com.backend.itau.model.TransacaoModel;
import com.backend.itau.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;
    private final TransacaoMapper transacaoMapper;
    @Autowired
    public TransacaoService(TransacaoRepository transacaoRepository, TransacaoMapper transacaoMapper) {
        this.transacaoRepository = transacaoRepository;
        this.transacaoMapper = transacaoMapper;
    }

    public TransacaoDTO realizaTransacao(TransacaoModel transacao) {
        return transacaoMapper.toDTO(transacaoRepository.save(transacao));
    }
}
