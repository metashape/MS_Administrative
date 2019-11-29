package br.com.metashape.funcionarios;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public class CadastroFuncionarios {

    private DiretorioFuncionarios funcionarios;

    public CadastroFuncionarios(DiretorioFuncionarios repositorio) {
        this.funcionarios = repositorio;
    }

    public void cadastrar(Funcionario funcionario)
            throws FuncionarioJaCadastradoException, DiretorioException {
        if (funcionario != null) {
            if (!this.funcionarios.existe(funcionario.getMatricula())) {
                this.funcionarios.inserir(funcionario);
            } else {
                throw new FuncionarioJaCadastradoException(funcionario
                        .getMatricula());
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void remover(String matricula)
            throws FuncionarioNaoEncontradoException, DiretorioException {
        this.funcionarios.remover(matricula);
    }

    public boolean existe(String matricula) throws DiretorioException {
        return this.funcionarios.existe(matricula);
    }

    public DiretorioFuncionarios getFuncionarios()
            throws DiretorioException {
        return this.funcionarios.getFuncionarios();
    }

    public Funcionario procurar(String matricula)
            throws FuncionarioNaoEncontradoException, DiretorioException {
        return this.funcionarios.procurar(matricula);
    }

    public Funcionario procurarPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException {
        return this.funcionarios.procurar(nome);
    }

    public void atualizar(Funcionario funcionario)
            throws FuncionarioNaoEncontradoException, DiretorioException {
        this.funcionarios.atualizar(funcionario);
    }

    public Funcionario[] listarTudo() throws DiretorioException {
        return this.funcionarios.getFuncionariosCadastrados();
    }

}
