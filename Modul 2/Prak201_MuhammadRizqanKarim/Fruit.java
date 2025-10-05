package Prak201_MuhammadRizqanKarim;

public class Fruit {
    String name;
    double weight, price, purchaseAmount, priceBeforeDiscount, priceAfterDiscount, totalDiscount;

    public Fruit(String fruitName, double fruitWeight, int fruitPrice, double purchaseAmount) {
        this.name = fruitName;
        this.weight = fruitWeight;
        this.price = fruitPrice;
        this.purchaseAmount = purchaseAmount;
        this.priceBeforeDiscount = price * (purchaseAmount / fruitWeight);
        this.totalDiscount = (int) (purchaseAmount / 4) * (4 * price) * 0.02;
        this.priceAfterDiscount = priceBeforeDiscount - totalDiscount;
    }

    public void display() {
        System.out.println("Nama Buah: " + name);
        System.out.println("Berat: " + weight + " kg");
        System.out.println("Harga: Rp" + price);
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", priceBeforeDiscount));
        System.out.println("Total Diskon: Rp" + totalDiscount);
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", priceAfterDiscount) + "\n");
    }
}