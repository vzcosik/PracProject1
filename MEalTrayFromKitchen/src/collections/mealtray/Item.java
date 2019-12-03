package collections.mealtray;

import java.util.Objects;


public class Item {
    private Integer id;
    private String name;
    private String nutrition;
    private Integer stock;
    
    public Item () {       
    }
    
    public Item (Integer id, String name, String nutrition, Integer stock) {
        this.id = id;
        this.name = name;
        this.nutrition = nutrition;
        this.stock = stock;
    }
 
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getNutrition() {
        return nutrition;
    }

  
    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    
    public Integer getStock() {
        return stock;
    }

    
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    
    public Integer getid() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.nutrition);
        hash = 29 * hash + Objects.hashCode(this.stock);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nutrition, other.nutrition)) {
            return false;
        }
        if (!Objects.equals(this.stock, other.stock)) {
            return false;
        }
        return true;
    }

    
    public void setPid(Integer id) {
        this.id = id;
    }   
}
