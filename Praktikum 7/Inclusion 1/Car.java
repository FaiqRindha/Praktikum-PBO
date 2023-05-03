/**
 * File      : Car.java		03/05/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : turunan class Vehicle
 *
 */

package com.oracle.training;

public class Car extends Vehicle{
	void calRent(int jarak, float harga){ 
		float fare=jarak*harga;
		fare=fare-1000.00f;
		System.out.println("harga sewa mobil = "+fare);
	}
}

