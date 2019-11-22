package br.com.metashape.utils;

/**
 *
 * @author pedrobertolini
 */
public class RepException extends Exception{    
    
    private Exception exception;

    public RepException(Exception exception) {
        super("Exceção encapsulada");
        this.exception = exception;
    }

    @Override
    public String getMessage() {
        return exception.getMessage();
    }

    @Override
    public void printStackTrace() {
    }
    
}
