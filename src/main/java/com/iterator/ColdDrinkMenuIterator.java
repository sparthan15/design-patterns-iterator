package com.iterator;

import restaurant.menu.MenuItem;

import java.util.Iterator;

public class ColdDrinkMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public ColdDrinkMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (menuItems.length == 0
                || position >= menuItems.length
                || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {

        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}