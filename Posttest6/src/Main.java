package Posttest2.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while(true){
            System.out.println("+=============================+");
            System.out.println("|    SISTEM PENDATAAN IDOL    |");
            System.out.println("+=============================+");
            System.out.println("|           M E N U           |");
            System.out.println("+-----------------------------+");
            System.out.println("| 1. ADMIN                    |");
            System.out.println("| 2. GRUP                     |");
            System.out.println("| 3. MEMBER                   |");
            System.out.println("| 0. Exit Program             |");
            System.out.println("+-----------------------------+");

            System.out.print("Pilih Diri Anda: ");
            int pilihan = Integer.parseInt(br.readLine());
            System.out.print("\n");

            if (pilihan==1){
                Adm adm = new Adm("", "", 0, "", "");
                adm.menu();
                continue;
            }

            else if (pilihan==2){
                Grup grup = new Grup("", "", "", 0, 0, "");
                grup.menu();
                continue;
                
            }

            else if(pilihan==3){
                Anggota anggota = new Anggota("", "", 0, 0, 0, "");
                anggota.menu();
                continue;
            }

            else if (pilihan==0){
                System.out.println("--Terima Kasih--");
                System.out.println("+----------+");
                System.out.println("|   EXIT   |");
                System.out.println("+----------+");
                System.exit(1);
                break;
            }

            else {
                System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }
}
