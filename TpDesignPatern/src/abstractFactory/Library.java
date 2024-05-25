package abstractFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Library {

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        GraphicComponentfactory factory = null ;
        System.out.println("Voulez vous une interface Windows (1), Linux (2) ou Mac (3) ?");

        while (factory == null) {
            String choice = reader.next();
            if (choice.equals("1")){
                factory = new WindowsFactory();

            } else if (choice.equals("2")) {
                factory = new LinuxFactory();
            }else if (choice.equals("3")){
                factory = new MacFactory();
            }else {
                System.out.println("Veuillez refaire votre choix");
            }
        }

        reader.close();

    }
}
