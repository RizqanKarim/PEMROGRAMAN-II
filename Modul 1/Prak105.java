import java.util.Scanner;

public class Prak105 {
    public static final double PI = 3.14159265359;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();

        double volume = PI * radius * radius * height;

        System.out.print("Volume tabung dengan jari-jari " + radius + " cm dan ");
        System.out.printf("tinggi %.1f cm adalah %.6f m3\n", height, volume);

        scanner.close();
    }
}