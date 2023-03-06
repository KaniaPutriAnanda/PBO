package Posttest;
public class Grup {
    //Property
    String namaGrup;
    String agensi;
    String laguDebut;
    int tahunDebut;
    int jmlMember;


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
    // System.out.println("Nama Grup Idol         : " + this.namaGrup);
    // System.out.println("Agensi Grup Idol       : " + this.agensi);
    // System.out.println("Lagu Debut Grup Idol   : " + this.laguDebut);
    // System.out.println("Tahun Debut Grup Idol  : " + this.tahunDebut);
    // System.out.println("Jumlah Member Grup Idol: " + this.jmlMember);
    // System.out.print("\n");
    System.out.println("---DATA BERHASIL DI TAMBAH---");
    System.out.print("\n");
}

public void baru(){
    // System.out.println("Nama Grup Idol         : " + this.namaGrup);
    // System.out.println("Agensi Grup Idol       : " + this.agensi);
    // System.out.println("Lagu Debut Grup Idol   : " + this.laguDebut);
    // System.out.println("Tahun Debut Grup Idol  : " + this.tahunDebut);
    // System.out.println("Jumlah Member Grup Idol: " + this.jmlMember);
    // System.out.print("\n");
    System.out.println("---DATA BERHASIL DI PERBARUI---");
    System.out.print("\n");
}

}

