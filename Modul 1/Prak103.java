import java.util.Scanner;

public class Prak103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan N dan bilangan awal: ");
        int n = scanner.nextInt();
        int initialNumber = scanner.nextInt();

        int displayedCount = 0;
        int currentNumber = initialNumber;

        do {
            if (currentNumber % 2 != 0) {
                System.out.print(currentNumber);
                displayedCount++;
                if (displayedCount < n) {
                    System.out.print(", ");
                }
            }
            currentNumber++;
        } while (displayedCount < n);

        System.out.println();
        scanner.close();
    }
}