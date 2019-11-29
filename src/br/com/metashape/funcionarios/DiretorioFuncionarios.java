package br.com.metashape.funcionarios;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public interface DiretorioFuncionarios {

    public void inserir(Funcionario funcionario) throws DiretorioException;

    public void remover(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException;

    public Funcionario procurar(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException;

    public Funcionario procurarPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException;

    public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, DiretorioException;

    public boolean existe(String matricula) throws DiretorioException;

    public DiretorioFuncionarios getFuncionarios() throws DiretorioException;

    public Funcionario[] getFuncionariosCadastrados() throws DiretorioException;

    public IteratorFuncionarios getIterator() throws DiretorioException;
}
