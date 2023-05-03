/**
 * File      : BangunDatar.java		22/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 *
 */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    protected void setLuas(double Luas){
        this.luas = Luas;
    }

    public double getLuas() {
        return luas;
    }
}