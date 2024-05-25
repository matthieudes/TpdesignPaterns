package abstractFactory;

import javax.swing.*;

public interface GraphicComponentfactory {
    public Button createButton(String text);
    public Menu createMenu(String text);
}
