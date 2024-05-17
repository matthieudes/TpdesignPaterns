package abstractFactory;

import javax.swing.*;

public class WindowsButton extends Button{

    public WindowsButton(String text) {
        super(text);
    }

    @Override
    public java.awt.Button toSwingButton() {
        return new java.awt.Button("bouton Windows de "+super.text);
    }
}
