package br.com.metashape.utils;
/**
 *
 * @author pedrobertolini
 */
public class Usuario {

    private int id_usuario;
    private String nome;
    private String email;
    private String senha;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.ativo = true;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "id_usuario=" + id_usuario + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", ativo=" + ativo;
    }
    
    
    
    
    
    
   

}