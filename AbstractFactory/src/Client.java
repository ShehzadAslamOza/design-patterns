public class Client {

    public static void main(String[] args) {

        String os = "Mac";
        GuiFactory guiFactory;

        if (os.equals("Windows")) {
            guiFactory = new WindowsGuiFactory();
        } else {
            guiFactory = new MacGuiFactory();
        }

        Application application = new Application(guiFactory);
        application.render();

    }
}
