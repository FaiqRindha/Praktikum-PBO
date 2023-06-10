/**
* File      : MainDAO.java
* Penulis   : Fa'iq Rindha Maulana - 24060121130091
* Deskripsi : Main program untuk akses DAO.
**/ 

package Pertemuan9;

public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Faiq");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try{
            m.getPersonDAO().savePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
