/**
* File      : DAOManager.java
* Penulis   : Fa'iq Rindha Maulana - 24060121130091
* Deskripsi : Pengelola DAO dalam program.
**/ 

package Pertemuan9;

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person){
        personDAO = person;
    }

    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
