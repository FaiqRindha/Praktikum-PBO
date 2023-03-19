/**
 * File : BujurSangkar.java 15/03/2023
 * Penulis : Fa'iq Rindha Maulana
 * Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
 */
 
 package org.bangundatar;
 
 import org.poligon.Poligon;
 
 public class BujurSangkar extends Poligon{
	 private double panjangSisi;
	 
	 public BujurSangkar(double panjangSisi){
		 this.jumlahSisi = 4;
		 this.panjangSisi = panjangSisi;
	 }
	 
	 public double hitungLuas(){
		 return panjangSisi * panjangSisi;
	 }
	 
	 public double getPanjangSisi(){
		 return this.panjangSisi;
	 }
 }
		 