/**
 * File      	: Lingkaran.java 30/05/23
 * Penulis 		: Fa'iq Rindha Maulana - 24060121130091
 * Deskripsi 	: implementasi Lingkaran sebagai BangunDatar
 *                
 */

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}