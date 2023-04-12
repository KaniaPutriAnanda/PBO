package Posttest2.src;

public class JadwalComeback {
    protected String titleTrack;
    protected String namaAlbum;
    protected String tanggal;
    protected String waktu;
    protected String grupName;
    public JadwalComeback(String titleTrack, String namaAlbum, String tanggal, String waktu, String grupName) {
        this.titleTrack = titleTrack;
        this.namaAlbum = namaAlbum;
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.grupName = grupName;
    }
    public String getTitleTrack() {
        return titleTrack;
    }
    public void setTitleTrack(String titleTrack) {
        this.titleTrack = titleTrack;
    }
    public String getNamaAlbum() {
        return namaAlbum;
    }
    public void setNamaAlbum(String namaAlbum) {
        this.namaAlbum = namaAlbum;
    }
    public String getTanggal() {
        return tanggal;
    }
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public String getWaktu() {
        return waktu;
    }
    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }
    public String getGrupName() {
        return grupName;
    }
    public void setGrupName(String grupName) {
        this.grupName = grupName;
    }
    
    
    
    
}

