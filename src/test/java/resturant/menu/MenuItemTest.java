package resturant.menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import restaurant.menu.MenuItem;

public class MenuItemTest {

    @Test
    public void test() {
        MenuItem menuItem = new MenuItem.Builder().build();
        Assertions.assertNotNull(menuItem);
    }

    @Test
    public void testProperties() {
        MenuItem menuItem = new MenuItem.Builder()
                .price(2.0)
                .name("Pancake")
                .description("Pancake")
                .build();
        Assertions.assertNotNull(menuItem.getName());
        Assertions.assertNotNull(menuItem.getPrice());
        Assertions.assertNotNull(menuItem.getDescription());
    }

    @Test
    public void testFreeMenuProperties() {
        MenuItem menuItem = new MenuItem.FreeItemBuilder()
                .name("Pancake")
                .description("Pancake")
                .build();
        Assertions.assertNotNull(menuItem.getName());
        Assertions.assertEquals(0.0, menuItem.getPrice());
        Assertions.assertNotNull(menuItem.getDescription());

    }
}