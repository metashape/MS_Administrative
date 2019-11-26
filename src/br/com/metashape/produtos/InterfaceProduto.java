package br.com.metashape.produtos;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public interface InterfaceProduto {

    public void inserir(Produto produto) throws ProdutoNaoEncontradoException,
            ProdutoJaCadastradoException;

    public void remover(String nome) throws ProdutoNaoEncontradoException, DiretorioException;

    //Busca
    public Object[] procurarTodos() throws ProdutoNaoEncontradoException, DiretorioException;

    public Produto procurarPorNome(String nome) throws ProdutoNaoEncontradoException, DiretorioException;

    public Produto procurarPorSku(String sku) throws ProdutoNaoEncontradoException, DiretorioException;

    public Produto[] procurarPorCategoria(String categoria) throws ProdutoNaoEncontradoException, DiretorioException;

    //Manipular
    public void atualizar(Produto Produto) throws ProdutoNaoEncontradoException, DiretorioException;

    public boolean existe(String sku) throws DiretorioException;

}
