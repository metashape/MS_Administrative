package br.com.metashape.funcionarios;

import br.com.metashape.funcionarios.*;

/**
 *
 * @author pedrobertolini
 */
public class FuncionarioJaCadastradoException extends Exception {

    private String matricula;

    public FuncionarioJaCadastradoException(String matricula) {
        super("Funcionário já existente!");
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}
