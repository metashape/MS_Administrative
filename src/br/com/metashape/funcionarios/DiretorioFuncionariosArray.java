package br.com.metashape.funcionarios;

import br.com.metashape.utils.DiretorioException;

/**
 *
 * @author pedrobertolini
 */
public class DiretorioFuncionariosArray implements DiretorioFuncionarios {

    private Funcionario[] funcionarios;
    private int indice;
    public static final int TAMANHO_DEFAULT = 100;

    public DiretorioFuncionariosArray() {
        this.funcionarios = new Funcionario[TAMANHO_DEFAULT];
        this.indice = 0;
    }

    DiretorioFuncionariosArray(Funcionario[] contas, int indice) {
        this.funcionarios = contas;
        this.indice = indice;
    }

    public void inserir(Funcionario conta) {
        this.funcionarios[this.indice] = conta;
        this.indice = this.indice + 1;
    }

    public void remover(String matricula) throws FuncionarioNaoEncontradoException {
        int i = getIndice(matricula);
        this.funcionarios[i] = this.funcionarios[this.indice - 1];
        this.indice = this.indice - 1;
        this.funcionarios[this.indice] = null;
    }

    public Funcionario procurar(String matricula) throws FuncionarioNaoEncontradoException {
        int i = getIndice(matricula);
        return this.funcionarios[i];
    }

    public void atualizar(Funcionario conta) throws FuncionarioNaoEncontradoException {
        int i = getIndice(conta.getMatricula());
        this.funcionarios[i] = conta;
    }

    public boolean existe(String matricula) {
        boolean resposta;
        try {
            getIndice(matricula);
            resposta = true;
        } catch (FuncionarioNaoEncontradoException ex) {
            resposta = false;
        }
        return resposta;
    }

    public DiretorioFuncionarios getFuncionarios() {
        // deveria retornar um clone por seguran�a
        return this;
    }

    public IteratorFuncionarios getIterator() {
        IteratorFuncionarios iterator = new IteratorFuncionariosArray(
                this.funcionarios);
        return iterator;
    }

    public Funcionario[] getTodosFuncionarios() {
        return this.funcionarios;
    }

    public int getIndice() {
        return this.indice;
    }

    private int getIndice(String matricula) throws FuncionarioNaoEncontradoException {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < this.indice); i = i + 1) {
            if (this.funcionarios[i].getMatricula().equals(matricula)) {
                resposta = i;
                achou = true;
            }
        }
        if (!achou) {
            throw new FuncionarioNaoEncontradoException(matricula);
        }
        return resposta;
    }

    private int getIndicePorNome(String nome) throws FuncionarioNaoEncontradoException {
        int resposta = -1;
        boolean achou = false;
        for (int i = 0; !achou && (i < this.indice); i = i + 1) {
            if (this.funcionarios[i].getNome().equals(nome)) {
                resposta = i;
                achou = true;
            }
        }
        if (!achou) {
            throw new FuncionarioNaoEncontradoException(nome);
        }
        return resposta;
    }

    @Override
    public Funcionario[] getFuncionariosCadastrados()
            throws DiretorioException {
        if (getIndice() == 0) {
            System.out.println("N�o existem funcion�rios cadastrados no momento!");
        }

        return getTodosFuncionarios();
    }

    @Override
    public Funcionario procurarPorNome(String nome) throws FuncionarioNaoEncontradoException, DiretorioException {
        int i = getIndicePorNome(nome);
        return this.funcionarios[i];
    }
}
