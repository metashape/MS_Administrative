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
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getId_usuario() {
        return this.id_usuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "id_usuario=" + this.id_usuario + ", nome=" + this.nome + ", email=" + this.email + ", senha=" + this.senha + ", ativo=" + this.ativo;
    }

}
