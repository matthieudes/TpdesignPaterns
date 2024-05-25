package abstractFactory;

public class MacFactory implements GraphicComponentfactory{

    @Override
    public Button createButton(String text) {
        return new MacButton("Mac");
    }

    @Override
    public Menu createMenu(String text) {
        return new MacMenu("Mac");
    }
}
