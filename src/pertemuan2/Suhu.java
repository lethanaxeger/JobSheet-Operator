package pertemuan2;

import java.util.Scanner;

public class Suhu {
    
    public static void main(String[] args) {
        // deklarasi
        Double fahrenheit, celcius;
        
        // membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        // input
        System.out.println("== Program Konversi Suhu ==");
        System.out.println("-------------------------------");
        System.out.println("Please [Insert] the [Number] and then press [Enter]");
        System.out.print("Input Celcius: ");
        celcius = baca.nextDouble();
        System.out.print("Input Fahrenheit: ");
        fahrenheit = baca.nextDouble();
        
        // proses
        fahrenheit = ((9 * celcius / 5) + 32);
        celcius = ((fahrenheit - 32)  * 5 / 9);
        
        // output
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Celcius = " + celcius);
    }
}
