/**
 * File      : Sewa.java		03/05/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : turunan class Vehicle
 *
 */

package com.oracle.training;

public class Sewa {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();
		kendaraan.calRent(50, 1000);
		mobil.calRent(50, 1000);
		bis.calRent(50, 1000);
	}
}
