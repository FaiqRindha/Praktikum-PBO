/**
 * File : Titik.java 22/02/23
 * Penulis : Fa'iq Rindha Maulana
 * Deskripsi : Kelas Titik
 * 
 */ 

public class Titik{
	private double absis;  //absis
	private double ordinat; //ordinat
	private static int counterTitik; // penghitung objek titik yang telah dibuat
	
	public Titik(){
	
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik ++;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}

	public int getCounterTitik(){
		return counterTitik;
	}
}