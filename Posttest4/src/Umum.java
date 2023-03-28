package Posttest2.src;
public class Umum {
    //Property
    public String nama;
    public String namaAgensi;
    public int tahunDebut;  

    
public Umum(String nama, String namaAgensi, int tahunDebut) {
        this.nama = nama;
        this.namaAgensi = namaAgensi;
        this.tahunDebut = tahunDebut;
    }

    
public String getNama() {
    return nama;
}


public void setNama(String nama) {
    this.nama = nama;
}


public String getNamaAgensi() {
    return namaAgensi;
}


public void setNamaAgensi(String namaAgensi) {
    this.namaAgensi = namaAgensi;
}


public int getTahunDebut() {
    return tahunDebut;
}


public void setTahunDebut(int tahunDebut) {
    this.tahunDebut = tahunDebut;
}

public void notifTambah(){
    System.out.println("+---------------------------+");
    System.out.println("|   DATA BERHASIL DITAMBAH  |");
    System.out.println("+---------------------------+");
    System.out.print("\n");
}

}

