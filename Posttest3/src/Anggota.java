package Posttest2.src;

public class Anggota extends Umum {
    public int tahunLahir;
    private double tinggi;
    
    public Anggota(String nama, String namaAgensi, int tahunDebut, int tahunLahir, double tinggi) {
        super(nama, namaAgensi, tahunDebut);
        this.tahunLahir = tahunLahir;
        this.tinggi = tinggi;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

   
}
