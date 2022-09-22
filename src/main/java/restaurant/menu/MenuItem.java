package restaurant.menu;

import lombok.Getter;

@Getter
public class MenuItem {
    private String name;
    private double price;
    private String description;

    private MenuItem() {
    }

    public static class Builder {
        private MenuItem menuItem;

        public Builder() {
            menuItem = new MenuItem();
        }

        public Builder name(String name) {
            menuItem.name = name;
            return this;
        }

        public Builder description(String description) {
            menuItem.description = description;
            return this;
        }

        public Builder price(double price) {
            menuItem.price = price;
            return this;
        }

        public MenuItem build() {
            return menuItem;
        }
    }

    public static class FreeItemBuilder {
        private MenuItem menuItem;

        public FreeItemBuilder() {
            menuItem = new MenuItem();
            menuItem.price = 0.0;
        }

        public FreeItemBuilder description(String description) {
            menuItem.description = description;
            return this;
        }

        public FreeItemBuilder name(String name) {
            menuItem.name = name;
            return this;
        }

        public MenuItem build() {
            return menuItem;
        }
    }
}