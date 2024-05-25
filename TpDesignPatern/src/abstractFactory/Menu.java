package abstractFactory;

import javax.swing.*;

public abstract class Menu {
    protected String text;

    public Menu(String text) {
        this.text = text;
    }
    public abstract void toSwingMenu();
}
