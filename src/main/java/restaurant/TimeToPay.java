package restaurant;

import restaurant.menu.Menu;
import restaurant.menu.MenuItem;

import java.util.Iterator;

public class TimeToPay {

    private Menu cafeMenu;
    private Menu coldDrinkMenu;

    public TimeToPay(Menu cafeMenu, Menu coldDrinkMenu) {
        this.cafeMenu = cafeMenu;
        this.coldDrinkMenu = coldDrinkMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> cafeItems = cafeMenu.createIterator();
        Iterator<MenuItem> coldDrinkItems = coldDrinkMenu.createIterator();
        printMenu(cafeItems);
        printMenu(coldDrinkItems);

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.println(item.getName() + ": " + item.getPrice());
        }
    }


}