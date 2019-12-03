package collections.mealtray;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private final List<Item> items = new ArrayList<Item>();

    public Items() {
        this.initKitchenItems();
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public void initKitchenItems() {
        String [] itemNames = {"Oat-Meal", "Chicken-Sanwich", "Protein-Bars", "Pizza"};
        String [] itemNutrition = {"Fibre", "Carbs", "Protein", "Cabs+Fats"};
        Integer [] stock = {10, 6, 10, 11};
        
        for (int i=0; i < itemNames.length; i++) {
            this.items.add(new Item(i+1, itemNames[i], itemNutrition[i], stock[i]));
        }
    }
}
