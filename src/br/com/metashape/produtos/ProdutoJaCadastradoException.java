package br.com.metashape.produtos;

/**
 *
 * @author pedrobertolini
 */
public class ProdutoJaCadastradoException extends Exception {

    public ProdutoJaCadastradoException() {
        super("Produto já cadastrado!");
    }
}
