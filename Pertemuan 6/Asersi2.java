/**
 * File      : Asersi2.java		29/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Program untuk demo asersi, yang akan 
 *             menolak input jari jari yang bernilai nol
 *
 */

 //class Lingkaran
 class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 4; //inisialisasi nilai jari-jari 
        assert (jariJari > 0):"jari-jari tidak boleh nol!!!"; //jika = 0 maka asersi akan dijalankan
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

/* PERTANYAAN : 
 * secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
 * 
 * JAWABAN: 
 * Pada umumnya program Asersi2 ini tidak memiliki kesalahan yang sangat berarti karena program ini dapat berjalan dengan baik dan menghasilkan output yang benar tanpa eror
 * tetapi secara konsep terdapat hal yang kurang tepat, yaitu penggunaan asersi pada program ini.
 * Pada program diatas, assert digunakan untuk mengecek apakah nilai input jari-jari yang kita masukkan apakah bernilai lebih dari nol atau tidak, dan jika tidak maka
 * program tidak akan melanjutkan perhitungan dan mengeluarkan output error beserta comment yang sudah kita buat (dalam hal ini "jari-jari tidak boleh nol!!!").
 * Yang membuat konsepnya salah adalah karena secara default fungsi ini akan dimatikan dan assertion ini hanya bekerja jika kita melakukan pemanggilan fungsi assertion tersebut,
 * dan dalam keadaan normal (tidak menyalakan fungsi assertion) maka program tidak akan mengecek apakah jari-jari > 0 atau tidak karena --assertion bukan merupakan bagian dari program--.
 * 
 * untuk memastikan nilai jari-jari selalu lebih besar dari nol, Sebaiknya digunakan fungsi eksepsi atau penambahan line code untuk melakukan penanganan kesalahan (error handling)
 * agar pengecekan dapat selalu berlangsung jika program di-run.
 * 
*/



