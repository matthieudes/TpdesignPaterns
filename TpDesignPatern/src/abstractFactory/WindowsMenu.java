package abstractFactory;

import javax.swing.*;

public class WindowsMenu extends Menu{
    public WindowsMenu(String text) {
        super(text);
    }

    @Override
    public JMenuBar toSwingMenu() {
        JMenuBar mb = new JMenuBar();
        mb.add(Utils.createMenu("Menu "+text, "Windows"));
        return mb;
    }
}
