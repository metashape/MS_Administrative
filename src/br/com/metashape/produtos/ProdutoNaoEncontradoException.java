package br.com.metashape.produtos;
/**
 *
 * @author pedrobertolini
 */
public class ProdutoNaoEncontradoException extends Exception {
    public ProdutoNaoEncontradoException() {
		super("Produto não encontrado");
	}
}
