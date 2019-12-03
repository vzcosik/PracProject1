package collections.mealtray;

import java.util.List;
import java.util.Scanner;

public class UI {
	
	Tray tray = new Tray();
    private int ch = 0;
	
	public UI()
	{	menu();
	}
	
	public void startScreen()
	{	System.out.println("1. Display Kitchen items");
		System.out.println("2. Display Tray");
		System.out.println("0. Exit");
		System.out.println("**************************");
	}
	
	public void kitchenItemsMenu() {
		System.out.println("**************************");
        System.out.println("1. Add to Tray");
        System.out.println("2. Remove From Tray");
        System.out.println("0. Exit");
        System.out.println("**************************");
    }
	
	public void menu () {
        do {
            startScreen();
            getUserInput();
            
            switch (ch) {
                case 1: 
                    displayKitchenItems();
                    kitchenItemsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showTray();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    
                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addItemToTray();
                showTray();
                break;
            case 2:
                removeItemFromTray();
                break;
            default:
                
                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayKitchenItems() {
        List<Item> items = new Items().getItems();
        for (Item item1: items) {
            System.out.println(
                    item1.getid() + "- " +
                            item1.getName() + " " +
                            item1.getNutrition() + " " +
                            item1.getStock()
            );
        }
    }

    private void addItemToTray() {
        int id = getUserInput();
        tray.addItemToTrayByID(id);      
    }

    private void showTray() {
    	System.out.println("********TRAY-ITEMS********");
        tray.printTrayItems();
        System.out.println("**************************");
    }

    private void removeItemFromTray() {
        int id = getUserInput();
        tray.removeItemByID(id);
    }
}
