package abstractFactory;

import javax.swing.*;

public class LinuxButton extends Button {
    public LinuxButton(String text) {
        super(text);
    }

    @Override
    public java.awt.Button toSwingButton() {
        return new java.awt.Button("bouton Linux de "+super.text);
    }
}
