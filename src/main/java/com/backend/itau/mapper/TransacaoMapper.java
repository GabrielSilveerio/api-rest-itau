package com.backend.itau.mapper;

import com.backend.itau.dto.TransacaoDTO;
import com.backend.itau.model.TransacaoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransacaoMapper {

    public TransacaoDTO toDTO(TransacaoModel transacaoModel) {
        TransacaoDTO transacaoDTO = new TransacaoDTO();
        transacaoDTO.setData(transacaoModel.getData());
        transacaoDTO.setValor(transacaoModel.getValor());
        return transacaoDTO;
    }

}
