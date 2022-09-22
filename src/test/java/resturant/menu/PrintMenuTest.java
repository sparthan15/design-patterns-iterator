package resturant.menu;

import org.junit.jupiter.api.BeforeEach;
import restaurant.menu.CafeMenu;
import restaurant.menu.ColdDrinkMenu;
import restaurant.menu.MenuItem;

import java.util.List;

public class PrintMenuTest {
    private ColdDrinkMenu coldDrinkmenu;
    private CafeMenu cafeMenu;

    @BeforeEach
    public void setUp() {
        coldDrinkmenu = new ColdDrinkMenu(new MenuItem[]{new MenuItem.FreeItemBuilder()
                .name("Water")
                .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Water")
                        .build()
                , new MenuItem.FreeItemBuilder()
                .name("Water")
                .build()});
        cafeMenu = new CafeMenu(List.of(new MenuItem.Builder()
                        .name("Moca")
                        .price(1.5)
                        .build(),
                new MenuItem.FreeItemBuilder()
                        .name("American")
                        .build())
        );
    }


    public void test() {


    }
}