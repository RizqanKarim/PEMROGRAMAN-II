package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dice> diceList = new LinkedList<>();

        int rollAmount = input.nextInt();
        int total = 0;

        for (int i = 0; i < rollAmount; i++) {
            Dice d = new Dice();
            diceList.add(d);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + d.getValue());
            total += d.getValue();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
        input.close();
    }
}
