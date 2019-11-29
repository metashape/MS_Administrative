package br.com.metashape.lojas;

import br.com.metashape.funcionarios.*;
import br.com.metashape.funcionarios.*;

/**
 *
 * @author pedrobertolini
 */
public class LojaJaCadastradaException extends Exception {

    private String matricula;

    public LojaJaCadastradaException(String matricula) {
        super("Funcionário já existente!");
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
