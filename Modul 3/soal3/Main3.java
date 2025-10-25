package soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String studentId = input.nextLine();

                    boolean idExist = false;
                    for (Student m : studentList) {
                        if (m.getStudentId().equals(studentId)) {
                            idExist = true;
                            break;
                        }
                    }

                    if (!idExist) {
                        studentList.add(new Student(name, studentId));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    } else {
                        System.out.println("NIM sudah digunakan, tidak dapat menambahkan mahasiswa.");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String idRemove = input.nextLine();
                    boolean found = false;

                    for (Student m : studentList) {
                        if (m.getStudentId().equals(idRemove)) {
                            studentList.remove(m);
                            System.out.println("Mahasiswa dengan NIM " + idRemove + " telah dihapus.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String searchId = input.nextLine();
                    boolean exist = false;

                    for (Student m : studentList) {
                        if (m.getStudentId().equals(searchId)) {
                            System.out.println("Mahasiswa ditemukan!");
                            System.out.println("Nama: " + m.getName());
                            System.out.println("NIM : " + m.getStudentId());
                            exist = true;
                            break;
                        }
                    }

                    if (!exist) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("\nDaftar Mahasiswa:");
                    if (studentList.isEmpty()) {
                        System.out.println("Belum ada data mahasiswa.");
                    } else {
                        for (Student m : studentList) {
                            System.out.println("NIM: " + m.getStudentId() + ", Nama: " + m.getName());
                        }
                    }
                    break;

                case 0:
                    studentList.clear();
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (choice != 0);

        input.close();
    }
}
