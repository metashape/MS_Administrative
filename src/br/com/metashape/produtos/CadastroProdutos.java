package br.com.metashape.produtos;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public class CadastroProdutos {

    private InterfaceProduto produtos;

    public CadastroProdutos(InterfaceProduto repositorio) {
        this.produtos = repositorio;
    }

    public void cadastrar(Produto produto) throws DiretorioException, ProdutoNaoEncontradoException, ProdutoJaCadastradoException {
        this.produtos.inserir(produto);
    }

    public void remover(String nome) throws ProdutoNaoEncontradoException, DiretorioException {
        this.produtos.remover(nome);
    }

    public boolean existe(String nome) throws DiretorioException {
        return this.produtos.existe(nome);
    }

    public void atualizar(Produto produto) throws ProdutoNaoEncontradoException, DiretorioException {
        this.produtos.atualizar(produto);
    }

    public Produto procurarPorNome(String nome) throws ProdutoNaoEncontradoException, DiretorioException {
        return this.produtos.procurarPorNome(nome);
    }

    public Produto procurarPorSku(String sku) throws ProdutoNaoEncontradoException, DiretorioException {
        return this.produtos.procurarPorSku(sku);
    }

    public Object[] procurarTodos() throws ProdutoNaoEncontradoException, DiretorioException {
        return this.produtos.procurarTodos();
    }

    public Produto procurar(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
