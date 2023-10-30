/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package latihan20;
import java.util.Scanner;
        
/**
 *
 * @author user
 Nama              : Bintang Fajar Nusantara
 Nim               : 22205028
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program yang menampilkan target saldo tabungan 
 *
 */
public class Latihan20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bulan = 0;
        
        System.out.print("Saldo Awal: ");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("saldo target: ");
        int saldoTarget = scanner.nextInt();

        
        while (saldoAwal < saldoTarget) {
            bulan++;
            int bunga = saldoAwal * bungaPerBulan / 100 ;
            saldoAwal += bunga;
            System.out.println("Saldo di bulan ke-" + bulan + "= Rp." + saldoAwal);
            
 }
}
}
