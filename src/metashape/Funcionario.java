package metashape;

import java.util.ArrayList;
import java.util.Date;

public class Funcionario extends Usuario {
    private ArrayList<Departamento> permissions;
    private float salario;
    private int diastrabalhados;
    private float horasTrabalhadas;
    private float outrosGanhos;
    private float outrosGastos;
    private int advetencias;
    private ArrayList<String> comentarios;
    
    
    
    
    public Funcionario(String user, String senha, String nome, String sobrenome, String contato, String email, int sexo, Date nascimento, String endereco) {
        super(user, senha, nome, sobrenome, contato, email, sexo, nascimento, endereco);
    }
    

    
}
