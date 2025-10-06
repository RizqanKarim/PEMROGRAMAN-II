package Prak201_MuhammadRizqanKarim;

public class Fruit {
    private String name;
    private double weight;
    private double price;
    private double purchaseAmount;
    private double priceBeforeDiscount;
    private double totalDiscount;
    private double priceAfterDiscount;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void calculatePriceDetails() {
        this.priceBeforeDiscount = this.price * (this.purchaseAmount / this.weight);
        int discountBlocks = (int) (this.purchaseAmount / 4);
        double pricePer4kg = this.price / this.weight * 4;
        this.totalDiscount = discountBlocks * pricePer4kg * 0.02;
        this.priceAfterDiscount = this.priceBeforeDiscount - this.totalDiscount;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getPurchaseAmount(){
        return purchaseAmount;
    }

    public double getPriceBeforeDiscount() {
        return priceBeforeDiscount;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    public double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public void display() {
        System.out.println("Nama Buah: " + getName());
        System.out.println("Berat: " + getWeight() + " kg");
        System.out.println("Harga: Rp" + getPrice());
        System.out.println("Jumlah Beli: " + getPurchaseAmount() + "kg");
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", getPriceBeforeDiscount()));
        System.out.println("Total Diskon: Rp" + String.format("%.2f", getTotalDiscount()));
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", getPriceAfterDiscount()) + "\n");
    }
}