package soal2;

public class Cat extends Pet {
    // atribut
    private String furColor;

    // konstruktor kucing
    public Cat(String b, String n, String fc) {
        super(b, n);
        this.furColor = fc;
    }

    // method detail kucing
    public void displayCatDetails() {
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
    }
}
