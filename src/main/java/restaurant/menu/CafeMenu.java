package restaurant.menu;


import java.util.Iterator;
import java.util.List;

public class CafeMenu implements Menu {

    private final List<MenuItem> menuItems;
    public CafeMenu(List menuItems){
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public int size() {
        return menuItems.size();
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}