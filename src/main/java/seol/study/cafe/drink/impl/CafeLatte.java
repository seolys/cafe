package seol.study.cafe.drink.impl;

import seol.study.cafe.drink.BaseDrink;
import seol.study.cafe.menu.MenuItem;

public class CafeLatte extends BaseDrink {
    public CafeLatte(MenuItem menuItem) {
        super(menuItem);
    }

    @Override
    protected void addIngredient() {
        ingredient.add("MILK");
        ingredient.add("ESPRESSO");
    }
}
