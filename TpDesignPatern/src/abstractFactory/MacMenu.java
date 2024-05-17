package abstractFactory;

import javax.swing.*;

public class MacMenu extends Menu{

    public MacMenu(String text) {
        super(text);
    }

    @Override
    public JMenuBar toSwingMenu() {
        JMenuBar mb = new JMenuBar();
        mb.add(Utils.createMenu("Menu "+text, "Mac"));
        return mb;
    }
}
