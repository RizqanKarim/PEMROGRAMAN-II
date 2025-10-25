package soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Country> countryList = new LinkedList<>();

        HashMap<Integer, String> month = new HashMap<>();
        month.put(1, "Januari");
        month.put(2, "Februari");
        month.put(3, "Maret");
        month.put(4, "April");
        month.put(5, "Mei");
        month.put(6, "Juni");
        month.put(7, "Juli");
        month.put(8, "Agustus");
        month.put(9, "September");
        month.put(10, "Oktober");
        month.put(11, "November");
        month.put(12, "Desember");

        int countryAmount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < countryAmount; i++) {
            String name = input.nextLine();
            String type = input.nextLine();
            String leaderName = input.nextLine();

            if (type.equalsIgnoreCase("monarki")) {
                countryList.add(new Country(name, type, leaderName));
            } else {
                int independenceDate = input.nextInt();
                int independenceMonth = input.nextInt();
                int year = input.nextInt();
                input.nextLine();
                countryList.add(new Country(name, type, leaderName, independenceDate, independenceMonth, year));
            }
        }

        System.out.println();
        for (Country n : countryList) {
            n.display(month);
        }

        input.close();
    }
}
