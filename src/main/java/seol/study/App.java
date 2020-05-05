package seol.study;

import seol.study.cafe.barista.Barista;
import seol.study.cafe.barista.BaristaImpl;
import seol.study.cafe.customer.Customer;
import seol.study.cafe.customer.CustomerImpl;
import seol.study.cafe.drink.Drink;


public class App {
    public static void main( String[] args ) {
//        final String menuName = "Americano";
        final String menuName = "CafeLatte";
        Customer customer = new CustomerImpl();
        Barista barista = new BaristaImpl();

        customer.order(barista, menuName);
        Drink coffee = customer.getDrink();
        System.out.println("coffee.getName() = " + coffee.getName());
        System.out.println("coffee.getPrice() = " + coffee.getPrice());
        System.out.println("coffee.getIngredient() = " + coffee.getIngredient());
    }
}
