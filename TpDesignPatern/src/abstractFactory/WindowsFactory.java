package abstractFactory;

public class WindowsFactory implements GraphicComponentfactory{
    @Override
    public Button createButton(String text) {
        return new WindowsButton("Windows");
    }

    @Override
    public Menu createMenu(String text) {
        return new WindowsMenu("Windows");
    }
}
