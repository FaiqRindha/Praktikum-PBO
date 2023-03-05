/**
 * File : MTitik.java 22/02/23
 * Penulis : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Program utama untuk menjalankan kelas Titik.
 * 
 */ 
 
 class MTitik{
	 public static void main(String[] args){
		//titik t1=(4,5)
		Titik t1,t2,t3;
		t1 = new Titik();
		t1.setAbsis(4);
		t1.setOrdinat(5);
		
		//titik t2 = (3,6)
		t2 = new Titik();
		t2.setAbsis(3);
		t2.setOrdinat(6);
		
		//pemanggilan dengan overloading constructor
		t3 = new Titik(5,6);
		
		
		//run program
		System.out.println("Jumlah objek titik : "+t1.getCounterTitik());
		System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
		System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
		System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
	 }
 }
 