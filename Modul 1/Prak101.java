import java.util.Scanner;

public class Prak101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String fullName = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int birthYear = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = scanner.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = scanner.nextDouble();

        String monthName = "";
        switch (birthMonth) {
            case 1: monthName = "Januari"; break;
            case 2: monthName = "Februari"; break;
            case 3: monthName = "Maret"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "Mei"; break;
            case 6: monthName = "Juni"; break;
            case 7: monthName = "Juli"; break;
            case 8: monthName = "Agustus"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "Oktober"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "Desember"; break;
        }

        System.out.println("Nama Lengkap " + fullName + ", Lahir di " + birthPlace + " pada Tanggal " + birthDate + " " + monthName + " " + birthYear);
        System.out.println("Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");

        scanner.close();
    }
}