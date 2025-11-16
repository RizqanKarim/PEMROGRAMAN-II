package lat4;

public class UnknownCommand implements ICommand {
    private PetView view;

    public UnknownCommand(PetView view) {
        this.view = view;
    }

    public void execute() {
        view.showError("Perintah tidak dikenal!");
    }
}