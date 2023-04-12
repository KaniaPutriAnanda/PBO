package Posttest2.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Grup extends Umum implements Level1{ //final class
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<JadwalComeback> CBgrup = new ArrayList<JadwalComeback>();

    public String laguDebut;
    public int jmlMember;
    public final String status = "Grup Aktif"; //final variabel
    
    public Grup(String nama, String namaAgensi, String laguDebut, int tahunDebut, int jmlMember, String status) {
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

    public String getStatus() {
        return status;
    }

    @Override
    public void notifTambah() {
        System.out.print("\n");
        System.out.println("+----------------------------------+");
        System.out.println("|   IDOL BARU BERHASIL DITAMBAH    |");
        System.out.println("+----------------------------------+");
        System.out.print("\n");
    }

    @Override
    public void tampilan(){
        System.out.println("Nama Grup Idol          : " + this.nama);
        System.out.println("Nama Agensi Grup Idol   : " + this.namaAgensi);
        System.out.println("Lagu Debut Grup Idol    : " + this.laguDebut);
        System.out.println("Banyak Member Grup Idol : " + this.jmlMember);
        System.out.println("Tahun Debut Grup Idol   : " + this.tahunDebut);
        System.out.println("Status Grup Idol        : " + this.status);
    }

    // overloading
    static void group (int opsi){
        Idol.grup.remove(opsi-1);
    }
    
    //overloading
    static void group (int opsi, String grupNama, String grupAgensi, String grupLagu, int grupMember, int grupDebut ) {
        Idol.grup.get(opsi-1).setNama(grupNama);
        Idol.grup.get(opsi-1).setNamaAgensi(grupAgensi);
        Idol.grup.get(opsi-1).setLaguDebut(grupLagu);
        Idol.grup.get(opsi-1).setJmlMember(grupMember);
        Idol.grup.get(opsi-1).setTahunDebut(grupDebut);
    }

    @Override
    public void tambahJadwalComeback() throws IOException {
        System.out.print("\n");
        System.out.println("+==============================+");
        System.out.println("|       DATA JADWAL GRUP       |");
        System.out.println("+==============================+");
        System.out.println("|         T A M B A H          |");
        System.out.println("+------------------------------+");
        System.out.print("Masukan Title Track: ");
        String addTitleTrack = br.readLine();

        System.out.print("Masukan Nama Album : ");
        String addNamaAlbum = br.readLine();

        System.out.print("Tanggal Comeback   : ");
        String addTanggal = br.readLine();

        System.out.print("Waktu Comeback     : ");
        String addWaktu = br.readLine();

        System.out.print("Nama Grup Idol     : ");
        String addNama = br.readLine();

        JadwalComeback newJadwal = new JadwalComeback(addTitleTrack, addNamaAlbum, addTanggal, addWaktu, addNama);
        CBgrup.add(newJadwal);

        System.out.print("\n");
        System.out.println("+----------------------------------+");
        System.out.println("|   JADWAL BARU BERHASIL DITAMBAH  |");
        System.out.println("+----------------------------------+");
        System.out.print("\n");
        
    }

    @Override
    public void hapusJadwalComeback() throws IOException {
        lihatJadwalComeback();

        System.out.print("Pilih Data yang Ingin Dihapus: ");
        int pilihan = Integer.parseInt(br.readLine());

        if(pilihan <= CBgrup.size() || pilihan > 0){
            CBgrup.remove(pilihan-1);
            System.out.print("\n");
            System.out.println("+---------------------------+");
            System.out.println("|   DATA BERHASIL DIHAPUS   |");
            System.out.println("+---------------------------+");
            System.out.print("\n");
        } else {
            System.out.println("+----------------+");
            System.out.println("| TIDAK ADA DATA |");
            System.out.println("+----------------+");
            System.out.print("\n");
        }
        
    }

    @Override
    public void lihatJadwalComeback() throws IOException {
        System.out.print("\n");
        System.out.println("+======================+");
        System.out.println("|   DATA JADWAL GRUP   |");
        System.out.println("+======================+");
        System.out.println("|       L I H A T      |");
        System.out.println("+----------------------+");
        System.out.print("\n");
        for (int i = 0; i < CBgrup.size(); i++) {
            System.out.println("       DATA KE - " + (i+1));
            System.out.println("Title Track     : " + CBgrup.get(i).getTitleTrack());
            System.out.println("Nama Album      : " + CBgrup.get(i).getNamaAlbum());
            System.out.println("Tanggal Comeback: " + CBgrup.get(i).getTanggal());
            System.out.println("Waktu Comeback  : " + CBgrup.get(i).getWaktu());
            System.out.println("Nama Grup Idol  : " + CBgrup.get(i).getGrupName());
            System.out.print("\n");
        }
        
    }

    @Override
    public void updateJadwalComeback() throws IOException {
        lihatJadwalComeback();

        System.out.print("Pilih Data yang Ingin Diedit: ");
        int pilihan = Integer.parseInt(br.readLine());

        if(pilihan <= CBgrup.size() || pilihan > 0){
            System.out.print("Masukan Title Track: ");
            String addTitleTrack = br.readLine();

            System.out.print("Masukan Nama Album : ");
            String addNamaAlbum = br.readLine();

            System.out.print("Tanggal Comeback   : ");
            String addTanggal = br.readLine();

            System.out.print("Waktu Comeback     : ");
            String addWaktu = br.readLine();

            System.out.print("Nama Grup Idol     : ");
            String addNama = br.readLine();

            JadwalComeback updateJadwal = new JadwalComeback(addTitleTrack, addNamaAlbum, addTanggal, addWaktu, addNama);
            CBgrup.set(pilihan-1, updateJadwal);
            System.out.print("\n");
            System.out.println("+---------------------------+");
            System.out.println("|   DATA BERHASIL DIUBAH    |");
            System.out.println("+---------------------------+");
            System.out.print("\n");
        } else {
            System.out.println("+----------------+");
            System.out.println("| TIDAK ADA DATA |");
            System.out.println("+----------------+");
            System.out.print("\n");
        }
        
    }

      @Override
    public void menu() throws IOException {
        while (true) {
            System.out.println("+==========================+");
            System.out.println("|      DATA JADWAL GRUP    |");
            System.out.println("+==========================+");
            System.out.println("|         M E N U          |");
            System.out.println("+--------------------------+");
            System.out.println("| 1. Tambah Jadwal Comeback|");
            System.out.println("| 2. Lihat Jadwal Comeback |");
            System.out.println("| 3. Update Jadwal Comeback|");
            System.out.println("| 4. Hapus Jadwal Comeback |");
            System.out.println("| 0. Exit Program          |");
            System.out.println("+--------------------------+");

            System.out.print("Masukan Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    tambahJadwalComeback();
                    break;
                case 2:
                    lihatJadwalComeback();
                    break;
                case 3:
                    updateJadwalComeback();
                    break;
                case 4:
                    hapusJadwalComeback();  
                    break;
                case 0:
                    System.out.println("--Terima Kasih--");
                    System.out.println("+----------+");
                    System.out.println("|   EXIT   |");
                    System.out.println("+----------+");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        }
    }
        
}
