package Prak202_MuhammadRizqanKarim;

public class Coffee {
    String coffeeName, size, buyerName;
    int price;
    double tax;

    public void info() {
        System.out.println("Nama Kopi: " + coffeeName);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: Rp" + price);
    }

    public void setBuyer(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getBuyer() {
        return buyerName;
    }

    public double tax() {
        tax = price * 0.11;
        return tax;
    }
}