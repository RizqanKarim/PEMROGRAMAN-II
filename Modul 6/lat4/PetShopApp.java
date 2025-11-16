package lat4;

import java.util.Scanner;

public class PetShopApp {
    private final PetRepository repository;
    private final PetView view;
    private final Scanner scanner;
    private boolean isRunning;

    public PetShopApp(PetRepository repository, PetView view) {
        this.repository = repository;
        this.view = view;
        this.scanner = new Scanner(System.in);
        this.isRunning = true;
    }

    public void run() {
        view.showWelcome();
        while (isRunning) {
            view.showMenu(repository.getAllPets());
            String input = scanner.nextLine().trim().toLowerCase();

            ICommand command = getCommand(input);
            command.execute();
        }
        view.showGoodbye();
        scanner.close();
    }

    private ICommand getCommand(String input) {
        if (input.equals("exit")) {
            return new ExitCommand(this);
        }
        Pet pet = repository.findPet(input);
        if (pet != null) {
            return new SpeakCommand(pet, view);
        }
        return new UnknownCommand(view);
    }

    public void stop() {
        this.isRunning = false;
    }
}
