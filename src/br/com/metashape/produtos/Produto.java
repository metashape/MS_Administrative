package br.com.metashape.produtos;
import br.com.metashape.utils.Sku;
import java.awt.Image;
import java.util.Date;
import javax.swing.JFormattedTextField;
/**
 *
 * @author pedrobertolini
 */
public class Produto {

    public String cod_sku;
    private String nome_sku;
    private String sabor_cor;
    private String descricao;
    private String categoria;
    private boolean ativo;
    private int quantidade;
    private String valor;

    public Produto() {
    }

    public Produto(String cod_sku, String nome_sku, String sabor_cor, String descricao, String categoria, int quantidade, String valor) {
        this.cod_sku = cod_sku;
        this.nome_sku = nome_sku;
        this.sabor_cor = sabor_cor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.ativo = true;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getCod_sku() {
        return cod_sku;
    }

    public void setCod_sku(String cod_sku) {
        this.cod_sku = cod_sku;
    }

    public String getNome_sku() {
        return nome_sku;
    }

    public void setNome_sku(String nome_sku) {
        this.nome_sku = nome_sku;
    }

    public String getSabor_cor() {
        return sabor_cor;
    }

    public void setSabor_cor(String sabor_cor) {
        this.sabor_cor = sabor_cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "cod_sku=" + cod_sku + ", nome_sku=" + nome_sku + ", sabor_cor=" + sabor_cor + ", descricao=" + descricao + ", categoria=" + categoria + ", ativo=" + ativo + ", quantidade=" + quantidade + ", valor=" + valor;
    }

   
}
