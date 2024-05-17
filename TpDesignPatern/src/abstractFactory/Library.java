package abstractFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Library {

    public static void main(String[] args){
        GraphicComponentfactory factory = new GraphicComponentfactory() {
            @Override
            public void createButton(String text) {
                new LinuxButton("linux");
            }

            @Override
            public void createMenu(String text) {
                new LinuxMenu("linux");
            }
        };



        JFrame frame = new JFrame();
        JMenuBar menuBar= new JMenuBar();
        frame.setJMenuBar(menuBar);
        frame.setLayout(new FlowLayout());
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
