package Prak202_MuhammadRizqanKarim;

public class Coffee {
    private String coffeeName;
    private String size;
    private String buyerName;
    private double price;

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBuyer(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getBuyer() {
        return buyerName;
    }

    public double getTax() {
        return this.price * 0.11;
    }

    public void info() {
        System.out.println("Nama Kopi: " + getCoffeeName());
        System.out.println("Ukuran: " + getSize());
        System.out.println("Harga: Rp. " + getPrice());
    }
}