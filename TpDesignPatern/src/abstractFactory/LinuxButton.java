package abstractFactory;

import javax.swing.*;

public class LinuxButton extends Button {
    public LinuxButton(String text) {
        super(text);
    }

    @Override
    public void show() {
        System.out.println("\ud83d\uddd4 Bouton"+text);
    }
}
