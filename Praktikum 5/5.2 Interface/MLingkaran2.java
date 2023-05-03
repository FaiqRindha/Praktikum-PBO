/**
 * File      : MLingkaran2.java		22/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : driver implementasi IArea berupa
 *             cara menghitung luas lingkaran dengan 
 *             fitur scan (input pengguna)
 *
 */
import java.util.Scanner;

public class MLingkaran2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jari-jari Lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l2 = new Lingkaran(jejari);
        scan.close();

        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + l2.hitungLuas());
    }    
}
