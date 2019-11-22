package br.com.metashape.produtos;

import br.com.metashape.utils.Sku;
import java.awt.Image;

/**
 *
 * @author pedrobertolini
 */
public class Produto extends Sku {
    
    public Produto(boolean gluten, int genre, int form, String flavor_or_color, String description, String category, String brand, boolean available, Image[] images, String important, boolean lactose, String meta, String recommendation_for_use, String sku_code, String sku_name, String source, String subcategory, String[] tags, String type, String under_type, int unit, String weight_quantity) {
        super(gluten, genre, form, flavor_or_color, description, category, brand, available, images, important, lactose, meta, recommendation_for_use, sku_code, sku_name, source, subcategory, tags, type, under_type, unit, weight_quantity);
    }
    
}
