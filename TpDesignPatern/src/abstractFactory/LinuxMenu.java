package abstractFactory;

import javax.swing.*;

public class LinuxMenu extends Menu{

    public LinuxMenu(String text) {
        super(text);
    }

    @Override
    public JMenuBar toSwingMenu() {
        JMenuBar mb = new JMenuBar();
        mb.add(Utils.createMenu("Menu "+ text, "Linux"));
        return mb;
    }
}
