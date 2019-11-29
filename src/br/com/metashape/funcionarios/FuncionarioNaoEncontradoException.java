package br.com.metashape.funcionarios;

import br.com.metashape.funcionarios.*;

/**
 *
 * @author pedrobertolini
 */
public class FuncionarioNaoEncontradoException extends Exception {

    private String matricula;

    public FuncionarioNaoEncontradoException(String matricula) {
        super("Funcionário não encontrado!");
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
