package seol.study.cafe.drink;

import seol.study.cafe.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDrink implements Drink {
    private String name;
    private int price;
    protected List<String> ingredient = new ArrayList<>();

    protected BaseDrink(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
        this.addIngredient();
    }

    protected abstract void addIngredient();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public List<String> getIngredient() {
        return ingredient;
    }
}
