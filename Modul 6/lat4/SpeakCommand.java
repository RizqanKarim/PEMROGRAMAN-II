package lat4;

public class SpeakCommand implements ICommand {
    private Pet pet;
    private PetView view;

    public SpeakCommand(Pet pet, PetView view) {
        this.pet = pet;
        this.view = view;
    }

    public void execute() {
        view.showResult(pet.speak());
    }
}
