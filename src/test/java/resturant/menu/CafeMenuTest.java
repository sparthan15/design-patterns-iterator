package resturant.menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import restaurant.menu.CafeMenu;
import restaurant.menu.MenuItem;

import java.util.List;

public class CafeMenuTest {

    @Test
    public void test() {
        CafeMenu cafeMenu = new CafeMenu(List.of(new CafeMenu(List.of(new MenuItem.Builder()
                .name("Moca")
                .price(1.5)
                .build()))));
        Assertions.assertNotNull(cafeMenu);
    }

    @Test
    public void menuHasListOfItems() {
        CafeMenu cafeMenu = new CafeMenu(List.of(new MenuItem.Builder()
                        .name("Moca")
                        .price(1.5)
                        .build(),
                new MenuItem.FreeItemBuilder()
                        .name("American")
                        .build())
        );

        Assertions.assertNotNull(cafeMenu.getMenuItems());
        Assertions.assertEquals(2, cafeMenu.size());
    }

    @Test
    public void validateIterator(){
        CafeMenu cafeMenu = new CafeMenu(List.of(new MenuItem.Builder()
                        .name("Moca")
                        .price(1.5)
                        .build(),
                new MenuItem.FreeItemBuilder()
                        .name("American")
                        .build())
        );

        Assertions.assertTrue(cafeMenu.createIterator().hasNext());
    }
}