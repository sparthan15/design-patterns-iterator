package restaurant.menu;

import com.iterator.ColdDrinkMenuIterator;

import java.util.Iterator;

public class ColdDrinkMenu implements Menu {
    private MenuItem[] menuItems;
    private int position=0;

    public ColdDrinkMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public int size() {
        return menuItems.length;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new ColdDrinkMenuIterator(menuItems);
    }
}