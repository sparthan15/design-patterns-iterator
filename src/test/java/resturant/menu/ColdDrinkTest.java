package resturant.menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import restaurant.menu.ColdDrinkMenu;
import restaurant.menu.MenuItem;

public class ColdDrinkTest {

    @Test
    public void test() {
        ColdDrinkMenu coldDrink = new ColdDrinkMenu(new MenuItem[]{});
        Assertions.assertNotNull(coldDrink);
    }

    @Test
    public void coldDrinkMenuHasItems() {
        ColdDrinkMenu coldDrink = new ColdDrinkMenu(new MenuItem[]{
                new MenuItem.FreeItemBuilder()
                        .name("Water")
                        .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Water")
                        .build()
        });
        Assertions.assertEquals(2, coldDrink.size());
    }

    @Test
    public void coldDrinkMenuHasItems2() {
        ColdDrinkMenu coldDrink = new ColdDrinkMenu(new MenuItem[]{new MenuItem.FreeItemBuilder()
                .name("Water")
                .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Water")
                        .build()
                , new MenuItem.FreeItemBuilder()
                .name("Water")
                .build()});
        Assertions.assertEquals(3, coldDrink.size());
    }

    @Test
    public void createIterator() {
        ColdDrinkMenu coldDrink = new ColdDrinkMenu(new MenuItem[]{new MenuItem.FreeItemBuilder()
                .name("Water")
                .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Water")
                        .build()
                , new MenuItem.FreeItemBuilder()
                .name("Water")
                .build()});
        Assertions.assertNotNull(coldDrink.createIterator());
    }

}