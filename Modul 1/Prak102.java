import java.util.Scanner;

public class Prak102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int currentNumber = scanner.nextInt();

        int i = 0;
        while (i < 11) {
            if (currentNumber % 5 == 0) {
                System.out.print((currentNumber / 5) - 1);
            } else {
                System.out.print(currentNumber);
            }

            if (i < 10) {
                System.out.print(", ");
            }

            currentNumber++;
            i++;
        }
        System.out.println();
        scanner.close();
    }
}