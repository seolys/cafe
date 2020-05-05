package seol.study.cafe.barista;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import seol.study.cafe.drink.Drink;
import seol.study.cafe.drink.DrinkFactory;
import seol.study.cafe.drink.impl.CafeLatte;
import seol.study.cafe.menu.MenuItem;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static seol.study.cafe.menu.MenuItem.CAFE_LATTE;

public class BaristaImplTest {

    @Test
    public void makeDrink() {
        Barista barista = new BaristaImpl();
        final Drink drink = barista.makeDrink(CAFE_LATTE);

        assertThat(drink instanceof CafeLatte);
        assertThat(CAFE_LATTE.getName()).isEqualTo(drink.getName());
        assertThat(CAFE_LATTE.getPrice()).isEqualTo(drink.getPrice());
    }

    @Test(expected = DrinkFactory.FailedToMakeException.class)
    public void failMakeDrink() {
        Barista barista = new BaristaImpl();
        final Drink drink = barista.makeDrink(null);

        assertThat(drink instanceof CafeLatte);
    }
}