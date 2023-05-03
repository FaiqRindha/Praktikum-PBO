/**
 * File      : AngkaSial.java		29/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : program penggunaan exception buatan sendiri
 *             pengenalan klausa 'throw' dan 'throws'
 *
 */

 public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }else{
            System.out.println(angka+" bukan angka sial"); //jika eksepsi terjadi line kode ini tidak di eksekusi
        }
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(17);
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
    }catch (AngkaSialException ase){ //jika eksekusi terjadi line kode ini dieksekusi
        //method getMessage() telah ada pada kelas "Exception"
        System.out.println(ase.getMessage());
        System.out.println("hati-hati dengan memasukkan angka ");
    }
}
}


/*  
1.  Pertanyaan : Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
    Jawab :
    Tidak, ketika eksepsi terjadi maka baris ke 12 pada soal (atau baris 15 disini) tidak dieksekusi
    karena ketika eksepsi terjadi maka program tersebut berhenti dan dilemparkan lalu
    akan ditangkap oleh blok catch dengan mengeluarkan pesan sesuai yang ada pada mengeluarkan output 
    sesuai program (AngkaSialException ase) yaitu lalu melaksanakan method .getMessage().
    lalu akan mengeluarkan pesan ouput juga yaitu "hati-hati memasukkan angka!!!" karena masih
    bagian dari catch tersebut dan mengikuti code di klausa catch dan tidak melaksanakan baris 12 (baris 13).
2.  Pertanyaan :
    Apakah baris 21 pada angkaSial.java di atas dieksekusi?
    Jawab :
    Baris 21 pada soal (atau baris 25 disini) akan dieksekusi apabila eksepsi terjadi. Hal ini dikarenakan
    ketika metode cobaAngka(13) melakukan throw AngkaSialException, sesuai dengan klausa if else maka akan
    segera dialihkan ke blok catch yang menangani pengecualian ini. Sisa pernyataan dalam blok try setelah
    pernyataan yang melempar pengecualian tidak akan dieksekusi. 
    as.cobaAngka(12) tidak akan dieksekusi karena etika ditemukan ekspresi maka program tersebut akan diterminasi secara langsung
*/