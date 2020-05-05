package seol.study.cafe.menu;

import seol.study.cafe.drink.Drink;
import seol.study.cafe.drink.impl.Americano;
import seol.study.cafe.drink.impl.CafeLatte;

public enum MenuItem {
    AMERICANO("Americano", 1500, Americano.class),
    CAFE_LATTE("CafeLatte", 2000, CafeLatte.class)
    ;

    private String name;
    private int price;
    private final Class<? extends Drink> recipe;

    MenuItem(String name, int price, Class<? extends Drink> recipe) {
        this.name = name;
        this.price = price;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Class<? extends Drink> getRecipe() {
        return recipe;
    }
}
