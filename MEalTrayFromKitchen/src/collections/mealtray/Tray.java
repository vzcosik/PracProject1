package collections.mealtray;

import java.util.ArrayList;
import java.util.List;


public class Tray {

    List<Item> trayItems = new ArrayList<Item>();
    
    public void addItemToTrayByID(int id) {
        Item item = getItemByItemID(id);
        addToTray(item);
    }

    private Item getItemByItemID(int id) {
        Item item = null;
        List<Item> items = new Items().getItems();
        for (Item item1: items) {
            if (item1.getid() == id) {
                item = item1;
                break;
            }
        }
        return item;
    }

    private void addToTray(Item item) {
        trayItems.add(item);
    }

    public void removeItemByID(int id) {
        Item item1 = getItemByItemID(id);
        trayItems.remove(item1);
    }

    void printTrayItems() {
        for (Item item1: trayItems) {
            System.out.println(item1.getName());
        }
    }
    
}
