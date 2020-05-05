package seol.study.cafe.customer;

import org.junit.Test;
import seol.study.cafe.barista.Barista;
import seol.study.cafe.barista.BaristaImpl;
import seol.study.cafe.drink.Drink;
import seol.study.cafe.drink.DrinkFactory;
import seol.study.cafe.drink.impl.Americano;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerTest {

    @Test
    public void order() {
        final String menuName = "Americano";
        Customer customer = new CustomerImpl();
        Barista barista = new BaristaImpl();

        customer.order(barista, menuName);
        Drink coffee = customer.getDrink();

        System.out.println(coffee.getIngredient());
        assertThat(coffee instanceof Americano).isTrue();
        assertThat(coffee.getName()).isEqualTo(menuName);
        assertThat(coffee.getIngredient()).containsExactly("WATER", "ESPRESSO");
    }

    @Test(expected = DrinkFactory.FailedToMakeException.class)
    public void failOrder() {
        final String menuName = "CaffeMocha";

        Customer customer = new CustomerImpl();
        BaristaImpl barista = new BaristaImpl();

        customer.order(barista, menuName);
        Drink coffee = customer.getDrink();

        System.out.println(coffee.getIngredient());
        assertThat(coffee.getName()).isEqualTo(menuName);
    }

}