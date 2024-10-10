public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
