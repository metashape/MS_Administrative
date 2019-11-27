package br.com.metashape.lojas;

import br.com.metashape.funcionarios.*;
import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public interface InterfaceLoja {

    public void inserir(Loja loja) throws DiretorioException;

    public void remover(String matricula) throws LojaNaoEncontradaException, DiretorioException;

    //Busca
    public Loja procurarTodos() throws LojaNaoEncontradaException, DiretorioException;

    public Loja procurarPorNome(String nome) throws LojaNaoEncontradaException, DiretorioException;

    public Loja procurarPorMatricula(String matricula) throws LojaNaoEncontradaException, DiretorioException;

    public Loja procurarPorEmail(String email) throws LojaNaoEncontradaException, DiretorioException;

    //
    public void atualizar(Loja loja) throws LojaNaoEncontradaException, DiretorioException;

    public boolean existe(String matricula) throws DiretorioException;

    public Loja[] getLojas() throws DiretorioException;

    public Loja[] getLojasCadastrados() throws DiretorioException;
    
    public Loja[] listarTudo() throws DiretorioException;

    public IteratorLojas getIterator() throws DiretorioException;
}
