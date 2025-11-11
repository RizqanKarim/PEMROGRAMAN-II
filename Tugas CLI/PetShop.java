package lat2;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class PetShop {

    private final Scanner scanner;
    private final Map<String, Pet> pets;
    private boolean isRunning;

    public PetShop() {
        this.scanner = new Scanner(System.in);
        this.pets = new HashMap<>();
        this.isRunning = true;

        this.pets.put("daoa", new Dog("Daoa si Anjing"));
        this.pets.put("alip", new Cat("Alip si Kucing"));
    }

    public void run() {
        System.out.println("Selamat Datang di Toko Hewan!");

        while (this.isRunning) {
            System.out.println("\n--- Daftar Hewan ---");
            System.out.println("Ketik nama panggilan hewan untuk mendengarnya bersuara:");

            for (String key : this.pets.keySet()) {
                Pet currentPet = this.pets.get(key);
                System.out.println("- " + key + " (" + currentPet.getName() + ")");
            }

            System.out.println("\nKetik 'exit' untuk keluar.");
            System.out.print("Pilihan Anda: ");

            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                this.isRunning = false;
            } else {
                Pet selectedPet = this.pets.get(input);

                if (selectedPet != null) {
                    selectedPet.speak();
                } else {
                    System.out.println("-> Hewan tidak ditemukan!");
                }
            }
        }

        System.out.println("Terima kasih sudah berkunjung!");
        scanner.close();
    }
}
