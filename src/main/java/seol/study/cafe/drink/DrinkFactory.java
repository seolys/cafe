package seol.study.cafe.drink;

import seol.study.cafe.menu.MenuItem;

public class DrinkFactory {
    public static Drink makeDrink(MenuItem menuItem) {
        try {
            Class<? extends Drink> recipe = menuItem.getRecipe();
            return recipe.getDeclaredConstructor(MenuItem.class).newInstance(menuItem);
        } catch (Exception e) {
            throw new FailedToMakeException(e);
        }
    }

    public static class FailedToMakeException extends RuntimeException {
        public FailedToMakeException(Throwable cause) {
            super(cause);
        }
    }
}
