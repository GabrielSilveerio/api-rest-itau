package com.backend.itau.dto;

import java.time.LocalDate;
import java.util.Date;

public class TransacaoDTO {
    private double valor;
    private LocalDate data;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
