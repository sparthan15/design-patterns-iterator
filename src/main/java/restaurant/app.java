package restaurant;

import restaurant.menu.CafeMenu;
import restaurant.menu.ColdDrinkMenu;
import restaurant.menu.Menu;
import restaurant.menu.MenuItem;

import java.util.List;

public class app {

    public static void main(String[] args){

        Menu cafeMenu = new CafeMenu(List.of(new MenuItem.Builder()
                        .name("Expresso")
                        .price(2.0)
                        .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Short")
                        .build()));
        Menu coldDrink = new ColdDrinkMenu(new MenuItem[]{new MenuItem.Builder()
                .name("Fanta")
                .price(2.0)
                .build(),
                new MenuItem.FreeItemBuilder()
                        .name("Water")
                        .build()});
        TimeToPay timeToPay = new TimeToPay(cafeMenu, coldDrink);
        timeToPay.printMenu();
    }
}