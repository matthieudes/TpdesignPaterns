package abstractFactory;

import javax.swing.*;

public class WindowsButton extends Button{

    public WindowsButton(String text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.println("\ud83d\uddd4 Bouton"+text);

    }
}
