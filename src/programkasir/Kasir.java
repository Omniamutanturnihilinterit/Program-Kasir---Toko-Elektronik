package programkasir;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Nama Barang yg tersedia
        System.out.println("***Toko Elektronik Sinar Jaya***");
        
        // Input nama barang
        System.out.print("Masukkan nama barang: ");
        String namaBarang = input.nextLine();
        
        // Input harga barang
        System.out.print("Masukkan harga barang: ");
        int hargaBarang = input.nextInt();
        
        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = input.nextInt();
        
        // Hitung total harga
        int totalHarga = hargaBarang * jumlahBarang;
        
        // Tampilkan hasil
        System.out.println("***Nota Pembayaran***");
        System.out.println("Barang yang dibeli: " + namaBarang);
        System.out.println("Harga barang: " + hargaBarang);
        System.out.println("Jumlah barang: " + jumlahBarang);
        System.out.println("Total harga: " + totalHarga);
    }
    
}
