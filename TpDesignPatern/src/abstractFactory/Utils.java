package abstractFactory;

import javax.swing.*;
import java.awt.Button;

public class Utils {

    public static JMenu createMenu(String title, String os){
        JMenu m = new JMenu(title);
        m.add(os+" Menu item #1");
        m.add(os+" Menu item #2");
        return m;
    }

    public java.awt.Button createButton(String text){
        java.awt.Button button = new Button(text);
        return button;
    }
}
