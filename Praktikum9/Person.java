/**
* File      : Person.java
* Penulis   : Fa'iq Rindha Maulana - 24060121130091
* Deskripsi : Person database model.
**/ 

package Pertemuan9;

public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
