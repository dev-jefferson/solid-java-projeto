package br.com.jhsgdev.rh.validation;

import br.com.jhsgdev.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
