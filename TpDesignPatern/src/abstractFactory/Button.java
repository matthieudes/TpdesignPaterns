package abstractFactory;

import javax.swing.*;

public abstract class Button {
    protected String text;

    public Button(String text) {
        this.text = text;
    }

    public abstract void show();
}
