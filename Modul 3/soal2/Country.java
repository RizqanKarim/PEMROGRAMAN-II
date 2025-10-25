package soal2;

import java.util.HashMap;

class Country {
    private String countryName;
    private String leadershipType;
    private String countryLeader;
    private int independenceDate;
    private int independenceMonth;
    private int year;

    public Country(String countryName, String leadershipType, String countryLeader,
                   int independenceDate, int independenceMonth, int year) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.countryLeader = countryLeader;
        this.independenceDate = independenceDate;
        this.independenceMonth = independenceMonth;
        this.year = year;
    }

    public Country(String countryName, String leadershipType, String countryLeader) {
        this.countryName = countryName;
        this.leadershipType = leadershipType;
        this.countryLeader = countryLeader;
    }

    public void display(HashMap<Integer, String> month) {
        if (leadershipType.equalsIgnoreCase("monarki")) {
            System.out.println("Negara " + countryName + " mempunyai Raja bernama " + countryLeader);
        } else {
            String jenis = leadershipType.substring(0, 1).toUpperCase() +
                    leadershipType.substring(1).toLowerCase();
            System.out.println("Negara " + countryName + " mempunyai " + jenis + " bernama " + countryLeader);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " +
                    independenceDate + " " + month.get(independenceMonth) + " " + year);
        }
        System.out.println();
    }
}
