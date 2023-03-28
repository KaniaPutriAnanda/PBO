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

    @Override
    public void notifTambah() {
        System.out.print("\n");
        System.out.println("+----------------------------------+");
        System.out.println("|   MEMBER BARU BERHASIL DITAMBAH  |");
        System.out.println("+----------------------------------+");
        System.out.print("\n");
    }

    //Overload Hapus
    static void member (int opsi){
        Idol.anggota.remove(opsi-1);
    }
    
    //Overload Update
    static void member (int opsi, String memberNama, String memberAgensi, int memberTahun, int memberLahir, double memberTinggi){
        Idol.anggota.get(opsi-1).setNama(memberNama);
        Idol.anggota.get(opsi-1).setNamaAgensi(memberAgensi);
        Idol.anggota.get(opsi-1).setTahunDebut(memberTahun);
        Idol.anggota.get(opsi-1).setTahunLahir(memberLahir);
        Idol.anggota.get(opsi-1).setTinggi(memberTinggi);
    }
}
