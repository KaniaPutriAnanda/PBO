package Posttest2.src;

public final class Anggota extends Umum { //final class
    public int tahunLahir;
    private double tinggi;
    public final String status = "Member Aktif"; //final variabel
    
    public Anggota(String nama, String namaAgensi, int tahunDebut, int tahunLahir, double tinggi, String status) {
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

    public String getStatus() {
        return status;
    }

    @Override
    public void notifTambah() {
        System.out.print("\n");
        System.out.println("+----------------------------------+");
        System.out.println("|   MEMBER BARU BERHASIL DITAMBAH  |");
        System.out.println("+----------------------------------+");
        System.out.print("\n");
    }

    @Override
    public void tampilan(){
        System.out.println("Nama Member        : " + this.nama);
        System.out.println("Agensi Member      : " + this.nama);
        System.out.println("Tahun Debut Member : " + this.tahunDebut);
        System.out.println("Tahun Lahir        : " + this.tahunLahir);
        System.out.println("Tinggi Badan       : " + this.tinggi + " m");
        System.out.println("Status Member      : " + this.status);
    }

    static void member (int opsi){
        Idol.anggota.remove(opsi-1);
    }

    static void member (int opsi, String memberNama, String memberAgensi, int memberTahun, int memberLahir, double memberTinggi){
        Idol.anggota.get(opsi-1).setNama(memberNama);
        Idol.anggota.get(opsi-1).setNamaAgensi(memberAgensi);
        Idol.anggota.get(opsi-1).setTahunDebut(memberTahun);
        Idol.anggota.get(opsi-1).setTahunLahir(memberLahir);
        Idol.anggota.get(opsi-1).setTinggi(memberTinggi);
    }
}
