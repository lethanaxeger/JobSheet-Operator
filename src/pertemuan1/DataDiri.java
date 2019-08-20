package pertemuan1;

public class DataDiri {
    private static String Darah;
    
    public static void main(String[] args) {
        // membuat variable
        String nama, alamat, hobi, makananfavorit;
        int usia;
        double tinggi;
        char darah;

        // mengisi variable
        nama = "Fadlillah Bashir Al Hakim";
        alamat = "Jl. Kapi Sraba IX Block 10C No. 39";
        hobi = "Memancing";
        makananfavorit = "Nasi";
        usia = 16;
        tinggi = 168.5;
               
                
        // mencetak ke layar isi variable
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " +alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Hobi: " + hobi);
        System.out.println("Makanan favorit: " + makananfavorit);
        System.out.println("darah: "+ "A" );
    }
} 