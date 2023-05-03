/**
 * File      : AngkaSialException.java		29/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 *
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
