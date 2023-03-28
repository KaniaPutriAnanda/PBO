package Posttest2.src;

public class Grup extends Umum {
    public String laguDebut;
    public int jmlMember;
    
    public Grup(String nama, String namaAgensi, String laguDebut, int tahunDebut, int jmlMember) {
        super(nama, namaAgensi, tahunDebut);
        this.laguDebut = laguDebut;
        this.jmlMember = jmlMember;
    }

    public String getLaguDebut() {
        return laguDebut;
    }

    public void setLaguDebut(String laguDebut) {
        this.laguDebut = laguDebut;
    }

    public int getJmlMember() {
        return jmlMember;
    }

    public void setJmlMember(int jmlMember) {
        this.jmlMember = jmlMember;
    }

    @Override
    public void notifTambah() {
        System.out.print("\n");
        System.out.println("+----------------------------------+");
        System.out.println("|   IDOL BARU BERHASIL DITAMBAH    |");
        System.out.println("+----------------------------------+");
        System.out.print("\n");
    }

    static void group (int opsi){
        Idol.grup.remove(opsi-1);
    }
    
    static void group (int opsi, String grupNama, String grupAgensi, String grupLagu, int grupMember, int grupDebut ) {
        Idol.grup.get(opsi-1).setNama(grupNama);
        Idol.grup.get(opsi-1).setNamaAgensi(grupAgensi);
        Idol.grup.get(opsi-1).setLaguDebut(grupLagu);
        Idol.grup.get(opsi-1).setJmlMember(grupMember);
        Idol.grup.get(opsi-1).setTahunDebut(grupDebut);
    }

    
}
