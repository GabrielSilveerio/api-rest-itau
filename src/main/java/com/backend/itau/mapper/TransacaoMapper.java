package com.backend.itau.mapper;

import com.backend.itau.dto.TransacaoDTO;
import com.backend.itau.model.TransacaoModel;
import org.springframework.beans.factory.annotation.Autowired;

public class TransacaoMapper {

    private final TransacaoDTO transacaoDTO;
    private final TransacaoModel transacaoModel;

    @Autowired
    public TransacaoMapper(TransacaoDTO transacaoDTO, TransacaoModel transacaoModel) {
        this.transacaoDTO = transacaoDTO;
        this.transacaoModel = transacaoModel;
    }

    public TransacaoDTO toDTO(TransacaoModel transacaoModel) {
        TransacaoDTO transacaoDTO = new TransacaoDTO();
        transacaoDTO.setData(transacaoModel.getData());
        transacaoDTO.setValor(transacaoModel.getValor());
        return transacaoDTO;
    }

}
