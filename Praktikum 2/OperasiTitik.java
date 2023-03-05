/**
 * File : OperasiTitik.java 01/03/23
 * Penulis : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Kelas yang berisi program untuk menjalankan kelas Operasi Titik
 * 
 */ 
 
 public class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double x;
		x = titik.getOrdinat();
		x *= -1;
		titik.setOrdinat(x);
	}
	private void refleksiSumbuY(Titik titik){
		double y;
		y = titik.getAbsis();
		y *= -1;
		titik.setAbsis(y);
	}
	public void refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return ;
	}
	public void refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return ;
	}
}