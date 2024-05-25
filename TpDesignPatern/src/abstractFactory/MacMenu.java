package abstractFactory;

import javax.swing.*;

public class MacMenu extends Menu{

    public MacMenu(String text) {
        super(text);
    }

    @Override
    public void toSwingMenu() {
        System.out.println(" \ud83d\uddd7 Menu"+text);
    }


}
