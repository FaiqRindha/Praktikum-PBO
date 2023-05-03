/**
 * File      : Lingkaran.java		22/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Kelas implementasi IArea berupa
 *             cara menghitung luas lingkaran
 *
 */

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
    public double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
    
}
