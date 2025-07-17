package com.backend.itau.mapper;

import com.backend.itau.dto.TransacaoDTO;
import com.backend.itau.model.TransacaoModel;

public class TransacaoMapper {

    private final TransacaoDTO transacaoDTO;
    private final TransacaoModel transacaoModel;


    public TransacaoMapper(TransacaoDTO transacaoDTO, TransacaoModel transacaoModel) {
        this.transacaoDTO = transacaoDTO;
        this.transacaoModel = transacaoModel;
    }

    public TransacaoDTO getTransacaoDTO(TransacaoModel transacaoModel) {
        TransacaoDTO transacaoDTO = new TransacaoDTO();
        transacaoDTO.setData(transacaoModel.getData());
        transacaoDTO.setValor(transacaoModel.getValor());
        return transacaoDTO;
    }

}
