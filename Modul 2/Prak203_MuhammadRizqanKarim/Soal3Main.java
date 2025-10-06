package Prak203_MuhammadRizqanKarim;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

        // Pada baris ini terjadi error karena tidak ada titik koma (;) di akhir statement.
        // Dan nama variabel menggunakan 'pl' (L kecil) bukan 'p1' (angka satu), menyebabkan inkonsistensi.
        // pl.nama = "Roi"
        p1.nama = "Roi";

        // Nama variabel diubah dari 'pl' ke 'p1' untuk konsistensi.
        // pl.asal = "Kingdom of Orvel";
        p1.asal = "Kingdom of Orvel";

        // Pada baris ini umur belum di-set, sehingga output akan menjadi 0. Umur perlu diinisialisasi.
        p1.umur = 17;

        p1.setJabatan("Assasin");

        // Teks output diubah agar sesuai dengan yang diminta soal.
        // System.out.println("Nama Pegawai: " + pl.getNama());
        System.out.println("Nama: " + p1.getNama());

        // Nama variabel diubah dari 'pl' ke 'p1' untuk konsistensi.
        // System.out.println("Asal: " + pl.getAsal());
        System.out.println("Asal: " + p1.getAsal());

        System.out.println("Jabatan: " + p1.jabatan);

        // Teks output diubah agar sesuai dengan yang diminta soal dengan menambahkan " tahun".
        // System.out.println("Umur: " + pl.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}