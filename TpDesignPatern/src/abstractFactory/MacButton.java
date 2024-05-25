package abstractFactory;

import javax.swing.*;

public class MacButton extends Button{

    public MacButton(String text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.println("\ud83d\uddd4 Bouton"+text);
    }
}
