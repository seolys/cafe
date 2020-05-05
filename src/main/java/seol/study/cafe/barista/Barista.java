package seol.study.cafe.barista;

import seol.study.cafe.drink.Drink;
import seol.study.cafe.menu.MenuItem;

public interface Barista {
    Drink makeDrink(MenuItem menuItem);
}
