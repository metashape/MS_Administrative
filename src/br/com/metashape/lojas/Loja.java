package br.com.metashape.lojas;


public class Loja {
   private int id_store;
   private String business_name;
   private String fancy_name;
   private String cnpj;
   private String cep;
   private String State_registration;
   private String opening_hours;
   private String working_days;
   private String store_address;
   private int  sales;
   private String responsible_name;
   private String phone_number;
   private int understock;
   private boolean active;
   private boolean available;

    public Loja(String business_name, String fancy_name, String cnpj, String cep, String State_registration, String opening_hours, String working_days, String store_address, int sales, String responsible_name, String phone_number, int understock, boolean active, boolean available) {
        this.business_name = business_name;
        this.fancy_name = fancy_name;
        this.cnpj = cnpj;
        this.cep = cep;
        this.State_registration = State_registration;
        this.opening_hours = opening_hours;
        this.working_days = working_days;
        this.store_address = store_address;
        this.sales = sales;
        this.responsible_name = responsible_name;
        this.phone_number = phone_number;
        this.understock = understock;
        this.active = active;
        this.available = available;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState_registration() {
        return State_registration;
    }

    public void setState_registration(String State_registration) {
        this.State_registration = State_registration;
    }

    public String getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(String opening_hours) {
        this.opening_hours = opening_hours;
    }

    public String getWorking_days() {
        return working_days;
    }

    public void setWorking_days(String working_days) {
        this.working_days = working_days;
    }

    public String getStore_address() {
        return store_address;
    }

    public void setStore_address(String store_address) {
        this.store_address = store_address;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getResponsible_name() {
        return responsible_name;
    }

    public void setResponsible_name(String responsible_name) {
        this.responsible_name = responsible_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getUnderstock() {
        return understock;
    }

    public void setUnderstock(int understock) {
        this.understock = understock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Loja{" + "id_store=" + id_store + ", business_name=" + business_name + ", fancy_name=" + fancy_name + ", cnpj=" + cnpj + ", cep=" + cep + ", State_registration=" + State_registration + ", opening_hours=" + opening_hours + ", working_days=" + working_days + ", store_address=" + store_address + ", sales=" + sales + ", responsible_name=" + responsible_name + ", phone_number=" + phone_number + ", understock=" + understock + ", active=" + active + ", available=" + available + '}';
    }
   
   
   
   
   
   
   
   
   
   
   
}
