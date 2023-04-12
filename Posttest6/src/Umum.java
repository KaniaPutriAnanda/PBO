package Posttest2.src;
public abstract class Umum { //abstract class
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

//abstract method
public abstract void notifTambah(); 
public abstract void tampilan(); 

}

