/**
 * File      : MBujurSangkar.java		22/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : kelas yang berisi driver dari kelas BujurSangkar
 *
 */
import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        scan.close();

        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " adalah " + bs.hitungLuas(sisi));
    }
}
