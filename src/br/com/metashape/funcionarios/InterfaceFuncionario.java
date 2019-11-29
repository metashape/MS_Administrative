package br.com.metashape.funcionarios;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public interface InterfaceFuncionario {

    public void inserir(Funcionario funcionario) throws DiretorioException;

    public void remover(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException;

    //Busca
    public Funcionario procurarTodos() throws FuncionarioNaoEncontradoException, DiretorioException;

    public Funcionario procurarPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException;

    public Funcionario procurarPorMatricula(String matricula) throws FuncionarioNaoEncontradoException, DiretorioException;

    public Funcionario procurarPorEmail(String email) throws FuncionarioNaoEncontradoException, DiretorioException;

    //Manipular
    public void atualizar(Funcionario funcionario) throws FuncionarioNaoEncontradoException, DiretorioException;

    public boolean existe(String matricula) throws DiretorioException;

    public InterfaceFuncionario getFuncionarios() throws DiretorioException;

    public Funcionario[] getFuncionariosCadastrados() throws DiretorioException;

    public IteratorFuncionarios getIterator() throws DiretorioException;
}
