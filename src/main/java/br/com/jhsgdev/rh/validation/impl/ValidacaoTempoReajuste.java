package br.com.jhsgdev.rh.validation.impl;

import br.com.jhsgdev.rh.ValidacaoException;
import br.com.jhsgdev.rh.model.Funcionario;
import br.com.jhsgdev.rh.validation.ValidacaoReajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoTempoReajuste implements ValidacaoReajuste {
    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo de reajuste deve ser de no minimo 6 meses!");
        }
    }
}
