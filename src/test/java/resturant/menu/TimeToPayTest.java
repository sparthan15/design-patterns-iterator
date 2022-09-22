package resturant.menu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import restaurant.TimeToPay;
import restaurant.menu.CafeMenu;
import restaurant.menu.ColdDrinkMenu;
import restaurant.menu.Menu;
import restaurant.menu.MenuItem;

import java.util.List;

public class TimeToPayTest {

    @Test
    public void test() {
        Menu cafeMenu = new CafeMenu(List.of(new MenuItem.Builder()
                        .name("Expresso")
                        .price(2.0)
                        .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Short")
                        .build()));
        Menu coldDrink = new ColdDrinkMenu(new MenuItem[]{new MenuItem.Builder()
                .name("Expresso")
                .price(2.0)
                .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Short")
                        .build()});
        TimeToPay timeToPay = new TimeToPay(cafeMenu, coldDrink);
        Assertions.assertNotNull(timeToPay);

    }
}