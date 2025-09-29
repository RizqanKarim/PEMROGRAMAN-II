import java.util.Scanner;

public class Prak104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuMoves = scanner.nextLine().replace(" ", "");

        System.out.print("Tangan Bagas: ");
        String bagasMoves = scanner.nextLine().replace(" ", "");

        int abuScore = 0;
        int bagasScore = 0;

        for (int i = 0; i < 3; i++) {
            char abuMove = abuMoves.charAt(i);
            char bagasMove = bagasMoves.charAt(i);

            if (abuMove == bagasMove) {
            } else if ((abuMove == 'B' && bagasMove == 'G') ||
                    (abuMove == 'G' && bagasMove == 'K') ||
                    (abuMove == 'K' && bagasMove == 'B')) {
                abuScore++;
            } else {
                bagasScore++;
            }
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}