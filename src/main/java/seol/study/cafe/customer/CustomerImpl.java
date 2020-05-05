package seol.study.cafe.customer;

import seol.study.cafe.barista.Barista;
import seol.study.cafe.drink.Drink;
import seol.study.cafe.menu.Menu;
import seol.study.cafe.menu.MenuItem;

public class CustomerImpl implements Customer {
    private Drink drink;

    @Override
    public void order(Barista barista, String menuName) {
        MenuItem menuItem = Menu.choose(menuName);
        this.drink = barista.makeDrink(menuItem);
    }

    @Override
    public Drink getDrink() {
        return drink;
    }
}
