package br.com.metashape.lojas;

/**
 *
 * @author pedrobertolini
 */
public class Loja {
   private int id_store;
   private String fancy_name;
   private String cnpj;
   private String State_registration;
   private String store_address;
   private String descricao;
   private boolean available;

    public Loja(int id_store, String fancy_name, String cnpj, String State_registration, String store_address, String descricao, boolean available) {
        this.id_store = id_store;
        this.fancy_name = fancy_name;
        this.cnpj = cnpj;
        this.State_registration = State_registration;
        this.store_address = store_address;
        this.descricao = descricao;
        this.available = available;
    }

   

    public int getId_store() {
        return id_store;
    }

    public String getFancy_name() {
        return fancy_name;
    }

    public void setFancy_name(String fancy_name) {
        this.fancy_name = fancy_name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getState_registration() {
        return State_registration;
    }

    public void setState_registration(String State_registration) {
        this.State_registration = State_registration;
    }

    public String getStore_address() {
        return store_address;
    }

    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Loja{" + "id_store=" + id_store + ", fancy_name=" + fancy_name + ", cnpj=" + cnpj + ", State_registration=" + State_registration + ", store_address=" + store_address + ", available=" + available + '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    

   
   
   
   
   
   
   
   
   
}
