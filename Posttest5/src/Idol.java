package Posttest2.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Idol {

    // Array list grup = menampung semua datanya
    static ArrayList<Grup> grup = new ArrayList<Grup>();
    static ArrayList<Anggota> anggota = new ArrayList<Anggota>();
    
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
                System.out.print("\n");
            }
        }

    }
        
    public final static void tambah() throws IOException{ //final method
        System.out.println("+==============================+");
        System.out.println("|        DATA GRUP IDOL        |");
        System.out.println("+==============================+");
        System.out.println("|         T A M B A H          |");
        System.out.println("+------------------------------+");
        System.out.println("| 1. Tambah Grup Idol          |");
        System.out.println("| 2. Tambah Member Grup Idol   |");
        System.out.println("+------------------------------+");

        System.out.print("Masukan Menu Pilihan Anda: ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.print("\n");
        if (pilihan == 1) {
            System.out.print("Masukkan Nama Grup Idol   : ");
            String addnama = br.readLine();

            System.out.print("Masukkan Agensi Grup Idol : ");
            String addagensi = br.readLine();

            System.out.print("Masukkan Lagu Debut       : ");
            String addlagu = br.readLine();

            System.out.print("Masukkan Banyak Member    : ");
            int addmember = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Tahun Debut      : ");
            int addtahun = Integer.parseInt(br.readLine());

            Grup grupBaru = new Grup(addnama, addagensi, addlagu, addmember, addtahun, "Grup Aktif");
            grup.add(grupBaru);

            //call overriding
            grupBaru.notifTambah();
        }
        
        else if (pilihan == 2) {
            System.out.print("Masukkan Nama Member        : ");
            String addnamaM = br.readLine();

            System.out.print("Masukkan Agensi Member      : ");
            String addagensiM = br.readLine();

            System.out.print("Masukkan Tahun Debut        : ");
            int addtahunM = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Tahun Lahir Member : ");
            int addtahunl = Integer.parseInt(br.readLine());

            System.out.print("Masukan Tinggi Badan Member : ");
            double addtinggi = Double.parseDouble(br.readLine());

            Anggota newMember = new Anggota(addnamaM, addagensiM, addtahunM, addtahunl, addtinggi, "Member Aktif");
            anggota.add(newMember);

            //call overriding
            newMember.notifTambah();
        }

        else {
            System.out.println("Pilihan Tidak Tersedia!!!");
            System.out.print("\n");
        }
    }

    public static void lihat() throws IOException{
        System.out.println("+======================+");
        System.out.println("|    DATA GRUP IDOL    |");
        System.out.println("+======================+");
        System.out.println("|       L I H A T      |");
        System.out.println("+----------------------+"); 
        System.out.println("| 1. Lihat Grup Idol   |");
        System.out.println("| 2. Lihat Member      |");
        System.out.println("+----------------------+"); 

        System.out.print("Masukan Menu Pilihan Anda: ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.print("\n");
        if (pilihan == 1) {
            if (grup.size()==0){
                System.out.println("+----------------+");
                System.out.println("| TIDAK ADA DATA |");
                System.out.println("+----------------+");
                System.out.print("\n");
            }

            else {
                for (int i=0; i < grup.size(); i++) {
                    System.out.println("       DATA KE - " + (i+1));
                    grup.get(i).tampilan(); //pemanggilan abstract method
                    System.out.println("\n");
                }
            }
        }

        else if (pilihan == 2) {
            if (anggota.size()==0){
                System.out.println("+----------------+");
                System.out.println("| TIDAK ADA DATA |");
                System.out.println("+----------------+");
                System.out.print("\n");
            }

            else {
                for (int i=0; i < anggota.size(); i++) {
                    System.out.println("       DATA KE - " + (i+1));
                    anggota.get(i).tampilan(); // pemanggilan abstract method
                    System.out.println("\n");
                }
            }
        }

        else {
            System.out.println("Pilihan Tidak Tersedia!!!");
            System.out.print("\n");
        }
    }
    
    public static void update() throws IOException{
        System.out.println("+==============================+");
        System.out.println("|        DATA GRUP IDOL        |");
        System.out.println("+==============================+");
        System.out.println("|         U P D A T E          |");
        System.out.println("+------------------------------+");
        System.out.println("| 1. Edit Grup Idol            |");
        System.out.println("| 2. Edit Member Grup Idol     |");
        System.out.println("+------------------------------+");
        
        System.out.print("Masukan Menu Pilihan Anda: ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.print("\n");

        if (pilihan == 1) {
            if (grup.size()==0){
                System.out.println("+----------------+");
                System.out.println("| TIDAK ADA DATA |");
                System.out.println("+----------------+");
                System.out.print("\n");
            }
            else {
                for (int i=0; i < grup.size(); i++) {
                    System.out.println("       DATA KE - " + (i+1));
                    grup.get(i).tampilan(); //pemanggilan abstract method
                    System.out.println("\n");
                }

                System.out.print("Pilih Data yang Ingin Diedit: ");
                int opsi = Integer.parseInt(br.readLine());

                System.out.print("Masukkan Nama Grup Idol   : ");
                String addnama = br.readLine();

                System.out.print("Masukkan Agensi Grup Idol : ");
                String addagensi = br.readLine();

                System.out.print("Masukkan Lagu Debut       : ");
                String addlagu = br.readLine();

                System.out.print("Masukkan Banyak Member    : ");
                int addmember = Integer.parseInt(br.readLine());

                System.out.print("Masukkan Tahun Debut      : ");
                int addtahun = Integer.parseInt(br.readLine());

                Grup.group(opsi, addnama, addagensi, addlagu, addmember, addtahun);
                    
                System.out.print("\n");
                System.out.println("+---------------------------+");
                System.out.println("|   DATA BERHASIL DIUPDATE  |");
                System.out.println("+---------------------------+");
                System.out.print("\n");
            }
        }

        else if (pilihan == 2) {
            if (anggota.size()==0){
                System.out.println("+----------------+");
                System.out.println("| TIDAK ADA DATA |");
                System.out.println("+----------------+");
                System.out.print("\n");
            }
            else {
                for (int i=0; i < anggota.size(); i++) {
                    System.out.println("       DATA KE - " + (i+1));
                    anggota.get(i).tampilan(); //pemanggilan abstract method
                    System.out.println("\n");
                }

                System.out.print("Pilih Data yang Ingin Diedit: ");
                int opsi = Integer.parseInt(br.readLine());

                System.out.print("Masukkan Nama Member   : ");
                String addnamaM = br.readLine();

                System.out.print("Masukkan Agensi Member : ");
                String addagensiM = br.readLine();

                System.out.print("Masukkan Tahun Debut   : ");
                int addtahunM = Integer.parseInt(br.readLine());

                System.out.print("Masukkan Tahun Lahir   : ");
                int addtahunl = Integer.parseInt(br.readLine());

                System.out.print("Masukan Tinggi Badan   : ");
                double addtinggi = Double.parseDouble(br.readLine());

                Anggota.member(opsi, addnamaM, addagensiM, addtahunM, addtahunl, addtinggi);

                    System.out.print("\n");
                    System.out.println("+---------------------------+");
                    System.out.println("|   DATA BERHASIL DIUPDATE  |");
                    System.out.println("+---------------------------+");
                    System.out.print("\n");
            }
        }

        else {
            System.out.println("Pilihan Tidak Tersedia!!!");
            System.out.print("\n");
        }
    }

    public static void hapus() throws IOException{
        System.out.println("+==============================+");
        System.out.println("|        DATA GRUP IDOL        |");
        System.out.println("+==============================+");
        System.out.println("|          H A P U S           |");
        System.out.println("+------------------------------+");
        System.out.println("| 1. Hapus Grup Idol           |");
        System.out.println("| 2. Hapus Member Grup Idol    |");
        System.out.println("+------------------------------+");

        System.out.print("Masukan Menu Pilihan Anda: ");
        int pilihan = Integer.parseInt(br.readLine());
        System.out.print("\n");

        if (pilihan == 1) {
            if (grup.size()==0){
                System.out.println("+----------------+");
                System.out.println("| TIDAK ADA DATA |");
                System.out.println("+----------------+");
                System.out.print("\n");
            }
            else {
                for (int i=0; i < grup.size(); i++) {
                    System.out.println("       DATA KE - " + (i+1));
                    grup.get(i).tampilan(); //pemanggilan abstract method
                    System.out.println("\n");
                }

                System.out.print("Pilih Data yang Ingin Dihapus: ");
                int opsi = Integer.parseInt(br.readLine());

                Grup.group(opsi);

                System.out.print("\n");
                System.out.println("+---------------------------+");
                System.out.println("|   DATA BERHASIL DIHAPUS   |");
                System.out.println("+---------------------------+");
                System.out.print("\n");    
            }
        }
            
        else if (pilihan == 2) {
            if (anggota.size()==0){
                System.out.println("+----------------+");
                System.out.println("| TIDAK ADA DATA |");
                System.out.println("+----------------+");
                System.out.print("\n");
            }
            else {
                for (int i=0; i < anggota.size(); i++) {
                    System.out.println("       DATA KE - " + (i+1));
                    anggota.get(i).tampilan(); //pemanggilan abstract method
                    System.out.println("\n");
                }
                
                System.out.print("Pilih Data yang Ingin Dihapus: ");
                int opsi = Integer.parseInt(br.readLine());

                Anggota.member(opsi);

                System.out.print("\n");
                System.out.println("+---------------------------+");
                System.out.println("|   DATA BERHASIL DIHAPUS   |");
                System.out.println("+---------------------------+");
                System.out.print("\n");
            }
        }

        else {
            System.out.println("Pilihan Tidak Tersedia!!!");
            System.out.print("\n");
        }

}
}