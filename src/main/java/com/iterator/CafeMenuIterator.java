package com.iterator;

import restaurant.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class CafeMenuIterator implements Iterator<MenuItem> {

    private final List<MenuItem> menuItems;

    public CafeMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        Iterator<MenuItem> iterator = menuItems.iterator();
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        Iterator<MenuItem> iterator = menuItems.iterator();
        return iterator.next();
    }
}