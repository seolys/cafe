package seol.study.cafe.customer;

import seol.study.cafe.barista.Barista;
import seol.study.cafe.drink.Drink;

public interface Customer {
    void order(Barista barista, String menuName);

    Drink getDrink();
}
