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

    
    
}
