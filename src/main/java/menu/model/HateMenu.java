package menu.model;

import menu.constants.ExceptionMessage;
import menu.constants.Menu;

import java.util.ArrayList;
import java.util.List;

public class HateMenu {
    private final List<String> hateMenus = new ArrayList<>();

    public HateMenu(List<String> hateMenus) {
        for (String hateMenu : hateMenus) {
            validateMenu(hateMenu);
            this.hateMenus.add(hateMenu);
        }
    }

    private void validateMenu(String menu) {
        if (!Menu.isExistMenu(menu)) {
            ExceptionMessage.NOT_EXIST_MENU.throwException();
        }
    }
}