package abstractFactory;

public class LinuxFactory implements GraphicComponentfactory {
    @Override
    public void createButton(String text) {
        new LinuxButton(text);
    }

    @Override
    public void createMenu(String text) {
        new LinuxMenu(text);
    }

}
