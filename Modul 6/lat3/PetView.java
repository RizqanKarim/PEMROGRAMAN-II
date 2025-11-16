package lat3;

import java.util.Map;

public class PetView {

    public void showWelcome() {
        System.out.println("Selamat Datang di Toko Hewan!");
    }

    public void showMenu(Map<String, Pet> pets) {
        System.out.println("\n--- Daftar Hewan ---");
        System.out.println("Ketik nama panggilan hewan untuk mendengarnya bersuara:");
        for (String key : pets.keySet()) {
            System.out.println("- " + key + " (" + pets.get(key).getName() + ")");
        }
        System.out.println("\nKetik 'exit' untuk keluar.");
        System.out.print("Pilihan Anda: ");
    }

    public void showResult(String sound) {
        System.out.println("-> " + sound);
    }

    public void showError(String message) {
        System.out.println("-> " + message);
    }

    public void showGoodbye() {
        System.out.println("Terima kasih sudah berkunjung!");
    }
}