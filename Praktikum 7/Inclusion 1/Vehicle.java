/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : class Vehicle
 *
 */

package com.oracle.training;

public class Vehicle {
	void calRent(int distance,float price){
		float fare=distance* price;
		System.out.println("vehicle price = "+fare);
	}
}
