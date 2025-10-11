package soal2;

public class Pet {
    // atribut
    private String name;
    private String breed;

    // konstruktor
    public Pet(String b, String n) {
        this.breed = b;
        this.name = n;
    }

    // method display
    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + name);
        System.out.println("Dengan ras: " + breed);
    }
}
