package com.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import restaurant.menu.MenuItem;

import java.util.Iterator;

public class ColdDrinkMenuIteratorTest {
    Iterator<MenuItem> menuIterator;

    @Test
    public void iteratorNext() {
        menuIterator = new ColdDrinkMenuIterator(new MenuItem[]{new MenuItem.FreeItemBuilder()
                .name("American")
                .build()});
        Assertions.assertNotNull(menuIterator.next());
    }

    @Test
    public void iteratorHasNext() {
        menuIterator = new ColdDrinkMenuIterator(new MenuItem[]{new MenuItem.FreeItemBuilder()
                .name("American")
                .build()});
        Assertions.assertTrue(menuIterator.hasNext());
    }

    @Test
    public void iteratorHasNotNext() {
        menuIterator = new ColdDrinkMenuIterator(new MenuItem[]{});
        Assertions.assertFalse(menuIterator.hasNext());
    }
}