package com.backend.itau.service;

import com.backend.itau.model.TransacaoModel;
import com.backend.itau.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;
    @Autowired
    public TransacaoService(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    public TransacaoModel realizaTransacao(TransacaoModel transacao) {
        return transacaoRepository.save(transacao);
    }
}
