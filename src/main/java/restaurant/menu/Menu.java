package restaurant.menu;

import java.util.Iterator;

public interface Menu {

    int size();

    Iterator<MenuItem> createIterator();
}