/**
 * File      : MLingkaran.java		22/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : driver implementasi IArea berupa
 *             cara menghitung luas lingkaran
 *
 */

public class MLingkaran {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari " + l.jejari + " adalah " + l.hitungLuas());
    }
    
}
