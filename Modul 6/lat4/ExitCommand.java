package lat4;

public class ExitCommand implements ICommand {
    private PetShopApp app;

    public ExitCommand(PetShopApp app) {
        this.app = app;
    }

    public void execute() {
        app.stop();
    }
}
