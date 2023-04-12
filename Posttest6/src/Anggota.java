package Posttest2.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Anggota extends Umum implements Level2{ //final class
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<SoloComeback> CBsolo = new ArrayList<SoloComeback>();


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

    // overloading
    static void member (int opsi){
        Idol.anggota.remove(opsi-1);
    }

    // overloading
    static void member (int opsi, String memberNama, String memberAgensi, int memberTahun, int memberLahir, double memberTinggi){
        Idol.anggota.get(opsi-1).setNama(memberNama);
        Idol.anggota.get(opsi-1).setNamaAgensi(memberAgensi);
        Idol.anggota.get(opsi-1).setTahunDebut(memberTahun);
        Idol.anggota.get(opsi-1).setTahunLahir(memberLahir);
        Idol.anggota.get(opsi-1).setTinggi(memberTinggi);
    }

    @Override
        public void tambahSoloComeback() throws IOException {
            System.out.print("\n");
            System.out.println("+==============================+");
            System.out.println("|      DATA JADWAL MEMBER      |");
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

            System.out.print("Nama Member        : ");
            String addNama = br.readLine();

            SoloComeback newSoloCB = new SoloComeback(addTitleTrack, addNamaAlbum, addTanggal, addWaktu, addNama);
            CBsolo.add(newSoloCB);

            System.out.print("\n");
            System.out.println("+----------------------------------+");
            System.out.println("|   JADWAL BARU BERHASIL DITAMBAH  |");
            System.out.println("+----------------------------------+");
            System.out.print("\n");
            
        }
    
      @Override
    public void lihatSoloComeback() throws IOException {
        System.out.print("\n");
        System.out.println("+======================+");
        System.out.println("|  DATA JADWAL MEMBER  |");
        System.out.println("+======================+");
        System.out.println("|       L I H A T      |");
        System.out.println("+----------------------+");
        System.out.print("\n");
        for (int i = 0; i < CBsolo.size(); i++) {
            System.out.println("       DATA KE - " + (i+1));
            System.out.println("Title Track     : " + CBsolo.get(i).getTitleTrack());
            System.out.println("Nama Album      : " + CBsolo.get(i).getNamaAlbum());
            System.out.println("Tanggal Comeback: " + CBsolo.get(i).getTanggalCB());
            System.out.println("Waktu Comeback  : " + CBsolo.get(i).getWaktuCB());
            System.out.println("Nama Member     : " + CBsolo.get(i).getNameMember());
            System.out.print("\n");
        }
        
    }

      @Override
    public void updateSoloComeback() throws IOException {
        lihatSoloComeback();
        System.out.print("\n");

        System.out.print("Pilih Data yang Ingin Diedit: ");
        int pilihan = Integer.parseInt(br.readLine());

        if(pilihan <= CBsolo.size() || pilihan > 0){
            System.out.print("Masukan Title Track: ");
            String addTitleTrack = br.readLine();

            System.out.print("Masukan Nama Album : ");
            String addNamaAlbum = br.readLine();

            System.out.print("Tanggal Comeback   : ");
            String addTanggal = br.readLine();

            System.out.print("Waktu Comeback     : ");
            String addWaktu = br.readLine();

            System.out.print("Nama Member        : ");
            String addNama = br.readLine();

            SoloComeback updateJadwalSolo = new SoloComeback(addTitleTrack, addNamaAlbum, addTanggal, addWaktu, addNama);
            CBsolo.set(pilihan-1, updateJadwalSolo);
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
    public void hapusSoloComeback() throws IOException {
        lihatSoloComeback();
        System.out.print("Pilih Data yang Ingin Dihapus: ");
        int pilihan = Integer.parseInt(br.readLine());

        if(pilihan <= CBsolo.size() || pilihan > 0){
            CBsolo.remove(pilihan-1);
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
    public void menu() throws IOException {
        while (true) {
            System.out.println("+==========================+");
            System.out.println("|    DATA JADWAL MEMBER    |");
            System.out.println("+==========================+");
            System.out.println("|         M E N U          |");
            System.out.println("+--------------------------+");
            System.out.println("| 1. Tambah Jadwal Comeback|");
            System.out.println("| 2. Lihat Jadwal Comeback |");
            System.out.println("| 3. Update Jadwal Comeback|");
            System.out.println("| 4. Hapus Jadwal Comeback |");
            System.out.println("| 0. Exit Program          |");
            System.out.println("+--------------------------+");

            System.out.print("Masukan Menu Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    tambahSoloComeback();
                    break;
                case 2:
                    lihatSoloComeback();
                    break;
                case 3:
                    updateSoloComeback();
                    break;
                case 4:
                    hapusSoloComeback();  
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
