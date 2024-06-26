package abstractFactory;

public class LinuxFactory implements GraphicComponentfactory {
    @Override
    public Button createButton(String text) {
        return new LinuxButton("Linux");
    }

    @Override
    public Menu createMenu(String text) {
        return new LinuxMenu("Linux");
    }
}
