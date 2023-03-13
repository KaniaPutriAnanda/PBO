package Posttest;

import java.util.*; 
import java.io.*;

public class Idol {

    // Array list grup = menampung semua datanya
    static ArrayList<Grup> idol_Grup = new ArrayList<Grup>();
    
    // BUFFERED READER (INPUT)
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        
        while (true) {
            System.out.println("+======================+");
            System.out.println("|    DATA GRUP IDOL    |");
            System.out.println("+======================+");
            System.out.println("|       M E N U        |");
            System.out.println("+----------------------+");
            System.out.println("| 1. Tambah Data Idol  |");
            System.out.println("| 2. Lihat Data Idol   |");
            System.out.println("| 3. Update Data Idol  |");
            System.out.println("| 4. Hapus Data Idol   |");
            System.out.println("| 0. Exit Program      |");
            System.out.println("+----------------------+");
            
            System.out.print("Masukan Menu Pilihan Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.print("\n");
            if (pilihan == 1) {
                tambah();
            } else if (pilihan == 2){
                lihat();
            } else if (pilihan == 3){
                update();
            } else if (pilihan == 4){
                hapus();
            } else if (pilihan == 0){
                System.out.println("+----------+");
                System.out.println("|   EXIT   |");
                System.out.println("+----------+");
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia!!!");
            }
        }

    }
        
    public static void tambah() throws IOException{
        System.out.println("+==============================+");
        System.out.println("|        DATA GRUP IDOL        |");
        System.out.println("+==============================+");
        System.out.println("|         T A M B A H          |");
        System.out.println("+------------------------------+");
        System.out.print("Masukan Nama Grup Idol         : ");
        String addnama = br.readLine();

        System.out.print("Masukan Nama Agensi Grup Idol  : ");
        String addagensi = br.readLine();

        System.out.print("Masukan Lagu Debut Grup Idol   : ");
        String addlagu = br.readLine();

        System.out.print("Masukan Tahun Debut Grup Idol  : ");
        int addtahun = Integer.parseInt(br.readLine());

        System.out.print("Masukan Jumlah Member Grup Idol: ");
        int addmember = Integer.parseInt(br.readLine());

        System.out.print("\n");

        Grup grupBaru = new Grup(addnama, addagensi, addlagu, addtahun, addmember); 
        
        // add == menambahkan data ke array list
        idol_Grup.add(grupBaru);
        
        //pemanggilan method grupIdol
        grupBaru.grupIdol();
    }

    public static void lihat() throws IOException{
        if (idol_Grup.size()==0){
            System.out.println("+----------------+");
            System.out.println("| TIDAK ADA DATA |");
            System.out.println("+----------------+");
            System.out.print("\n");
        }

        else {
            System.out.println("+======================+");
        System.out.println("|    DATA GRUP IDOL    |");
        System.out.println("+======================+");
        System.out.println("|       L I H A T      |");
        System.out.println("+----------------------+"); 
        // size == ukuran / panjang array list

        for (int i = 0; i < idol_Grup.size(); i++) {
            System.out.println("       DATA KE - " + (i+1));

            // get == mengambil data dari array list
            System.out.println("Nama Grup Idol         : " + idol_Grup.get(i).getNamaGrup());
            System.out.println("Nama Agensi Grup Idol  : " + idol_Grup.get(i).getAgensi());
            System.out.println("Lagu Debut Grup Idol   : " + idol_Grup.get(i).getLaguDebut());
            System.out.println("Tahun Debut Grup Idol  : " + idol_Grup.get(i).getTahunDebut());
            System.out.println("Jumlah Member Grup Idol: " + idol_Grup.get(i).getJmlMember());
            System.out.print("\n");
            }
        }
    }
    
    public static void update() throws IOException{

        if (idol_Grup.size()==0){
            System.out.println("+----------------+");
            System.out.println("| TIDAK ADA DATA |");
            System.out.println("+----------------+");
            System.out.print("\n");
        }
        else {
            lihat();

        System.out.println("+==============================+");
        System.out.println("|        DATA GRUP IDOL        |");
        System.out.println("+==============================+");
        System.out.println("|         U P D A T E          |");
        System.out.println("+------------------------------+");
        System.out.print("Pilih Data yang Ingin Diupdate : ");
        int index = Integer.parseInt(br.readLine());

        System.out.print("Masukan Nama Grup Idol         : ");
        String addnama = br.readLine();
        idol_Grup.get(index-1).setNamaGrup(addnama);

        System.out.print("Masukan Nama Agensi Grup Idol  : ");
        String addagensi = br.readLine();
        idol_Grup.get(index-1).setAgensi(addagensi);

        System.out.print("Masukan Lagu Debut Grup Idol   : ");
        String addlagu = br.readLine();
        idol_Grup.get(index-1).setLaguDebut(addlagu);

        System.out.print("Masukan Tahun Debut Grup Idol  : ");
        int addtahun = Integer.parseInt(br.readLine());
        idol_Grup.get(index-1).setTahunDebut(addtahun);

        System.out.print("Masukan Jumlah Member Grup Idol: ");
        int addmember = Integer.parseInt(br.readLine());
        idol_Grup.get(index-1).setJmlMember(addmember);

        System.out.print("\n");

        ///pemanggilan method terupdate
        idol_Grup.get(index-1).baru();
        }

        
    }

    public static void hapus() throws IOException{
        if (idol_Grup.size()==0){
            System.out.println("+----------------+");
            System.out.println("| TIDAK ADA DATA |");
            System.out.println("+----------------+");
            System.out.print("\n");
        }

        else{
            lihat();

        System.out.println("+==============================+");
        System.out.println("|        DATA GRUP IDOL        |");
        System.out.println("+==============================+");
        System.out.println("|          H A P U S           |");
        System.out.println("+------------------------------+");
        System.out.print("Pilih Data yang Ingin Dihapus: ");
        int index = Integer.parseInt(br.readLine());
        System.out.print("\n");
        // remove == menghapus data dari array list
        idol_Grup.remove(index-1).del();
        }
    }

        
}