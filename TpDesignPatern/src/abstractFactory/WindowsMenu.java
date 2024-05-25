package abstractFactory;

import javax.swing.*;

public class WindowsMenu extends Menu{
    public WindowsMenu(String text) {
        super(text);
    }

    @Override
    public void toSwingMenu() {
        System.out.println(" \ud83d\uddd7 Menu"+text);
    }
}
