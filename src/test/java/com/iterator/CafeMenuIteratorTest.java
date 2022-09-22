package com.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import restaurant.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

public class CafeMenuIteratorTest {
    Iterator<MenuItem> menuIterator;

    @Test
    public void iteratorHasNext() {
        menuIterator = new CafeMenuIterator(List.of(new MenuItem.FreeItemBuilder()
                .name("American")
                .build()));
        Assertions.assertTrue(menuIterator.hasNext());
    }

    @Test
    public void iteratorNext() {
        menuIterator = new CafeMenuIterator(List.of(new MenuItem.FreeItemBuilder()
                .name("American")
                .build()));
        Assertions.assertNotNull(menuIterator.next());
    }


}