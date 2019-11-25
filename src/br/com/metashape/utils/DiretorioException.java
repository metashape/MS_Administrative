package br.com.metashape.utils;
import br.com.metashape.lojas.*;
import br.com.metashape.funcionarios.*;
import br.com.metashape.produtos.*;
import br.com.metashape.controle.ControleEstoque.*;
/**
 *
 * @author pedrobertolini
 */
public class DiretorioException extends Exception {
    private Exception exception;

    public DiretorioException(Exception exception) {
        super("Exceção encapsulada");
        this.exception = exception;
    }

    public String getMessage() {
        return exception.getMessage();
    }

    public void printStackTrace() {
        exception.printStackTrace();
    }
}
