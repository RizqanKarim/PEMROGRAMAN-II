package lat3;

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

            if (input.equals("exit")) {
                this.isRunning = false;
            } else {
                Pet pet = repository.findPet(input);
                if (pet != null) {
                    String sound = pet.speak();
                    view.showResult(sound);
                } else {
                    view.showError("Hewan tidak ditemukan!");
                }
            }
        }
        view.showGoodbye();
        scanner.close();
    }
}
