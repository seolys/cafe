package seol.study.cafe.drink.impl;

import seol.study.cafe.drink.BaseDrink;
import seol.study.cafe.menu.MenuItem;

public class Americano extends BaseDrink {
    public Americano(MenuItem menuItem) {
        super(menuItem);
    }

    @Override
    protected void addIngredient() {
        ingredient.add("WATER");
        ingredient.add("ESPRESSO");
    }
}
