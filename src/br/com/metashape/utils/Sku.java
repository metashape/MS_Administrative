package br.com.metashape.utils;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;


public class Sku {        
    private int id_sku;
    private boolean gluten;
    private int genre;
    private int form;
    private String flavor_or_color;
    private String description;
    private String category;
    private String brand;
    private boolean available;
    private Image[] images;
    private String important;
    private boolean lactose;
    private String meta;
    private String recommendation_for_use;
    private String sku_code;
    private String sku_name;
    private String source;
    private String subcategory;
    private String[] tags;
    private String type;
    private String under_type;
    private int unit;
    private String weight_quantity;       

    public Sku(boolean gluten, int genre, int form, String flavor_or_color, String description, String category, String brand, boolean available, Image[] images, String important, boolean lactose, String meta, String recommendation_for_use, String sku_code, String sku_name, String source, String subcategory, String[] tags, String type, String under_type, int unit, String weight_quantity) {
        this.gluten = gluten;
        this.genre = genre;
        this.form = form;
        this.flavor_or_color = flavor_or_color;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.available = available;
        this.images = images;
        this.important = important;
        this.lactose = lactose;
        this.meta = meta;
        this.recommendation_for_use = recommendation_for_use;
        this.sku_code = sku_code;
        this.sku_name = sku_name;
        this.source = source;
        this.subcategory = subcategory;
        this.tags = tags;
        this.type = type;
        this.under_type = under_type;
        this.unit = unit;
        this.weight_quantity = weight_quantity;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }

    public String getFlavor_or_color() {
        return flavor_or_color;
    }

    public void setFlavor_or_color(String flavor_or_color) {
        this.flavor_or_color = flavor_or_color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public boolean isLactose() {
        return lactose;
    }

    public void setLactose(boolean lactose) {
        this.lactose = lactose;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getRecommendation_for_use() {
        return recommendation_for_use;
    }

    public void setRecommendation_for_use(String recommendation_for_use) {
        this.recommendation_for_use = recommendation_for_use;
    }

    public String getSku_code() {
        return sku_code;
    }

    public void setSku_code(String sku_code) {
        this.sku_code = sku_code;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnder_type() {
        return under_type;
    }

    public void setUnder_type(String under_type) {
        this.under_type = under_type;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getWeight_quantity() {
        return weight_quantity;
    }

    public void setWeight_quantity(String weight_quantity) {
        this.weight_quantity = weight_quantity;
    }

   
   @Override
   public String toString(){
       return "Sku Name: " + this.sku_name + "Available State: " + this.available;
   }
}
