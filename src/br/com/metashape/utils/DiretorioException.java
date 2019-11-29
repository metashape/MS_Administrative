package br.com.metashape.utils;

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
        return this.exception.getMessage();
    }

    public void printStackTrace() {
        this.exception.printStackTrace();
    }
}
