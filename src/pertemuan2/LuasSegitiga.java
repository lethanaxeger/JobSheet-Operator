package pertemuan2;

import java.util.Scanner;
        
public class LuasSegitiga {
    
    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas, tinggi;
      
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.println("------------------------------------");
        System.out.println("Please [Insert] the [Number] and then press [Enter]");
        System.out.print("Input Alas: ");
        alas = baca.nextInt();
        System.out.print("Input Tinggi: ");
        tinggi = baca.nextInt();
        
        // proses
        luas = Double.valueOf((alas * tinggi) / 2);
        
        // output
        System.out.println("Luas = " + luas);
    }
}