package seol.study.cafe.barista;

import seol.study.cafe.drink.Drink;
import seol.study.cafe.drink.DrinkFactory;
import seol.study.cafe.menu.MenuItem;

public class BaristaImpl implements Barista {
    @Override
    public Drink makeDrink(MenuItem menuItem) {
        return DrinkFactory.makeDrink(menuItem);
    }
}
