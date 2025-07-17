package com.backend.itau.service;

import com.backend.itau.dto.TransacaoDTO;
import com.backend.itau.mapper.TransacaoMapper;
import com.backend.itau.model.TransacaoModel;
import com.backend.itau.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class TransacaoService {

    private final TransacaoRepository transacaoRepository;
    private final TransacaoMapper transacaoMapper;

    @Autowired
    @Lazy
    public TransacaoService(TransacaoRepository transacaoRepository, TransacaoMapper transacaoMapper) {
        this.transacaoRepository = transacaoRepository;
        this.transacaoMapper = transacaoMapper;
    }

    public TransacaoDTO realizaTransacao(TransacaoModel transacao) {
        LocalDate data = LocalDate.now();
        transacao.setData(data);
        return transacaoMapper.toDTO(transacaoRepository.save(transacao));
    }
}
