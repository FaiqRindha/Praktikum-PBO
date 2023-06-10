/**
 * File : MapTest.java 24/05/2023
 * Nama : Fa'iq Rindha Maulana
 * NIM  : 24060121130091
 * Deskripsi : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 */

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,String> mahasiswa = new HashMap<>();
		mahasiswa.put("24060121130091", "Fa'iq Rindha Maulana");
		mahasiswa.forEach((nim, nama)->System.out.println("NIM: " + nim + ", Nama Mahasiswa: " + nama));
	}
}