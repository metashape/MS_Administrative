package metashape;

import java.util.Date;

public class Usuario {

    private int id_usuario;
    private String user;
    private String senha;
    private String nome;
    private String sobrenome;
    private String contato;
    private String email;
    private int sexo;
    private Date nascimento;
    private String endereco;
    private boolean active;

    public Usuario(String user, String senha, String nome, String sobrenome, String contato, String email, int sexo, Date nascimento, String endereco) {
        this.user = user;
        this.senha = senha;
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.contato = contato;
        this.email = email;
        this.sexo = sexo;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.active = true;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    

    

}
