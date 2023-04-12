package br.com.jhsgdev.rh.service;

import br.com.jhsgdev.rh.ValidacaoException;
import br.com.jhsgdev.rh.model.Cargo;
import br.com.jhsgdev.rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if (Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metaBatida){
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else{
            throw new ValidacaoException("Funcionário não bateu a meta!");
        }
    }
}
