package Prak201_MuhammadRizqanKarim;

public class Soal1Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.setName("Apel");
        apple.setWeight(0.4);
        apple.setPrice(7000);
        apple.setPurchaseAmount(40);
        apple.calculatePriceDetails();

        Fruit mango = new Fruit();
        mango.setName("Mangga");
        mango.setWeight(0.2);
        mango.setPrice(3500);
        mango.setPurchaseAmount(15);
        mango.calculatePriceDetails();

        Fruit avocado = new Fruit();
        avocado.setName("Alpukat");
        avocado.setWeight(0.25);
        avocado.setPrice(10000);
        avocado.setPurchaseAmount(12);
        avocado.calculatePriceDetails();

        apple.display();
        mango.display();
        avocado.display();
    }
}