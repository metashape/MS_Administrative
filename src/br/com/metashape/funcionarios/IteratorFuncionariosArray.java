package br.com.metashape.funcionarios;

/**
 *
 * @author pedrobertolini
 */
public class IteratorFuncionariosArray implements IteratorFuncionarios {

    private Funcionario[] funcionarios;
    private int indice;

    public IteratorFuncionariosArray(Funcionario[] contas) {
        this.funcionarios = contas;
        this.indice = 0;
    }

    public boolean hasNext() {
        return (this.indice < this.funcionarios.length) && (this.funcionarios[this.indice] != null);
    }

    public Funcionario next() {
        Funcionario resposta = null;
        if (hasNext()) {
            resposta = this.funcionarios[this.indice];
            this.indice = this.indice + 1;
        }
        return resposta;
    }
}
