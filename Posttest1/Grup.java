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

}

