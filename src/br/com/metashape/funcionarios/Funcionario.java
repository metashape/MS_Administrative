package br.com.metashape.funcionarios;

import br.com.metashape.utils.Usuario;
/**
 *
 * @author pedrobertolini
 */
public class Funcionario extends Usuario {
  
    private String matricula;
    private String especialidade;
    private float salario;

      public Funcionario(String matricula, String especialidade, float salario, String nome, String email, String senha) {
        super(nome, email, senha);
        this.matricula = matricula;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    
}
