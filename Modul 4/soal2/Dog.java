package soal2;

public class Dog extends Pet {
    // atribut
    private String furColor;
    private String[] abilities;

    // konstruktor
    public Dog(String n, String b, String fc, String[] a) {
        super(b, n);
        this.furColor = fc;
        this.abilities = a;
    }

    // method detail anjiing
    public void displayDogDetails() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.furColor);
        System.out.println("Memiliki kemampuan : ");
        for (String skill : this.abilities) {
            System.out.print(skill + " ");
        }
        System.out.println();
    }
}
