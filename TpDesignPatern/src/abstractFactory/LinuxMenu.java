package abstractFactory;

import javax.swing.*;

public class LinuxMenu extends Menu{

    public LinuxMenu(String text) {
        super(text);
    }

    @Override
    public void toSwingMenu() {
        System.out.println(" \ud83d\uddd7 Menu"+text);
    }
}
