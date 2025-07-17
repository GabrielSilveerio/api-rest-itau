package com.backend.itau.controller;

import com.backend.itau.dto.TransacaoDTO;
import com.backend.itau.model.TransacaoModel;
import com.backend.itau.repository.TransacaoRepository;
import com.backend.itau.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transacao")
@RestController
public class TransacaoController {

    private TransacaoService transacaoService;
    @Autowired
    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }
    @PostMapping
    public TransacaoDTO realizaTransacao(@RequestBody TransacaoModel transacao) {
        return transacaoService.realizaTransacao(transacao);
    }
}
