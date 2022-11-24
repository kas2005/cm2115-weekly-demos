package uk.ac.rgu.Topic8;

public class Person {
    private String surname, firstname;
    private int age;


    public Person(String surname, String firstname, int age){
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
    
    }
   
    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }



    
}
