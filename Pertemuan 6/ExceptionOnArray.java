/**
 * File      : ExceptionOnArray.java		29/03/23
 * Penulis   : Fa'iq Rindha Maulana / 24060121130091
 * Deskripsi : Program penggunaan eksepsi menggunakan class
 *             library Java
 *
 */

//video ver.

 import java.io.IOException;

 public class ExceptionOnArray {
     public static void main(String[] args){
        //instanisiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            //arrayInteger[4] = 10;
            throw new IOException();
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }catch(IOException exception){
            System.out.println("IOException caught");
        }finally{
            System.out.println("clean up code...");
        }
     }
 }


//modul ver.

/* 
 public class ExceptionOnArray{
    public static void main(String[] args){
        //intanisasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{ //blok try yang digunakan untuk menangkap kesalahan
            //statement yg memungkinkan terjadinya kesalahan
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        //fungsi catch untuk menangkap kesalahan ArrayIndexOutOfBoundsException
        //dan apa yang harus dilakukan saat terjadi kesalahan
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        //finally untuk mengeksekusi kode yang selalu dijalankan
        finally{
            System.out.println("clean up code...");
        }
    }
}

*/