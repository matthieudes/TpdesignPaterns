package abstractFactory;

import javax.swing.*;

public class MacButton extends Button{

    public MacButton(String text) {
        super(text);
    }

    @Override
    public java.awt.Button toSwingButton() {
        return new java.awt.Button("bouton Mac de "+super.text);
    }
}
