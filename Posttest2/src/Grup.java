package Posttest2.src;
public class Grup {
    //Property
    private String namaGrup;
    private String agensi;
    private String laguDebut;
    private int tahunDebut;
    private int jmlMember;

// getter & setter
public String getNamaGrup() {
        return namaGrup;
    }

    public void setNamaGrup(String namaGrup) {
        this.namaGrup = namaGrup;
    }

    public String getAgensi() {
        return agensi;
    }

    public void setAgensi(String agensi) {
        this.agensi = agensi;
    }

    public String getLaguDebut() {
        return laguDebut;
    }

    public void setLaguDebut(String laguDebut) {
        this.laguDebut = laguDebut;
    }

    public int getTahunDebut() {
        return tahunDebut;
    }

    public void setTahunDebut(int tahunDebut) {
        this.tahunDebut = tahunDebut;
    }

    public int getJmlMember() {
        return jmlMember;
    }

    public void setJmlMember(int jmlMember) {
        this.jmlMember = jmlMember;
    }

//Constructor
public Grup (String namaGrup, String agensi, String laguDebut, int tahunDebut, int jmlMember){
    this.namaGrup = namaGrup;
    this.agensi = agensi;
    this.laguDebut = laguDebut;
    this.tahunDebut = tahunDebut;
    this.jmlMember = jmlMember;
}

//Method
public void grupIdol(){
    System.out.println("+---------------------------+");
    System.out.println("|   DATA BERHASIL DITAMBAH  |");
    System.out.println("+---------------------------+");
    System.out.print("\n");
}

public void baru(){
    System.out.println("+---------------------------+");
    System.out.println("|   DATA BERHASIL DIUPDATE  |");
    System.out.println("+---------------------------+");
    System.out.print("\n");
}

public void del(){
    System.out.println("+---------------------------+");
    System.out.println("|   DATA BERHASIL DIHAPUS   |");
    System.out.println("+---------------------------+");
    System.out.print("\n");
}

public void exit(){
    System.out.println("+----------+");
    System.out.println("|   EXIT   |");
    System.out.println("+----------+");
}

}

