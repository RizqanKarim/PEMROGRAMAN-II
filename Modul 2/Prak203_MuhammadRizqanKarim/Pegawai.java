package Prak203_MuhammadRizqanKarim;

// Pada baris ini terjadi error karena nama class tidak sesuai dengan nama file dan object yang dibuat di Soal3Main.
// public class Employee {
public class Pegawai {
    public String nama;

    // Pada baris ini terjadi error karena tipe data 'asal' tidak sesuai. Seharusnya String untuk menampung "Kingdom of Orvel".
    // public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    // Pada baris ini terjadi error karena return type tidak sesuai dengan tipe data variabel 'asal' yang sudah diperbaiki.
    // public String getAsal() {
    //    return asal;
    // }
    // Metode ini tidak lagi diperlukan karena 'asal' sudah public String dan bisa diakses langsung.
    // Namun, jika mengikuti kaidah enkapsulasi yang baik, getter-nya akan seperti ini:
    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method tidak memiliki parameter untuk menerima jabatan.
    // Dan variabel 'j' tidak terdefinisi.
    // public void setJabatan() {
    //    this.jabatan = j;
    // }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}