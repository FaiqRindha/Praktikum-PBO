/**
 * File : MOperasiTitik.java 01/03/23
 * Penulis : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Program utama yang memanfaatkan operasi titik
 * 
 */ 
 
 class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4.0,4.0);
		OperasiTitik op = new OperasiTitik();
		System.out.println("Titik awal : (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
		op.refleksiX(t);
		System.out.println("Refleksi Sumbu X : (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
		op.refleksiY(t);
		System.out.println("Refleksi Sumbu Y : (" + t.getAbsis() + "," + t.getOrdinat() + ")" );
	}
}