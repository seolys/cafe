package seol.study.cafe.menu;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Menu {
    static List<MenuItem> menuItemList = null;
    static {
        menuItemList = Arrays.stream(MenuItem.values())
                                .collect(toList());
    }

    public static MenuItem choose(String menuName){
        for (MenuItem menuItem : Menu.menuItemList) {
            if (menuItem.getName().equals(menuName))
                return menuItem;
        }
        return null;
    }
}
