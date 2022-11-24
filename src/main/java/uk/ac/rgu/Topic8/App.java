package uk.ac.rgu.Topic8;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import java.util.Set;
import java.util.Map;

public class App {

        public static void main(String[] args){

            Person person1 = new Person("Smith", "John", 20 );
            Person person2 = new Person("Parker", "Peter", 50);
            Person person3 = new Person("Mouse", "Minnie", 5);
            Person person4 = new Person("Miles", "Morales", 17);

            Map<String, Person> myMap = new HashMap<>();

            myMap.put("Spider-Man", person1);
            myMap.put("Captain America", person2);
            myMap.put("Captain Marvel", person3);
            myMap.put("Captain Marvel", person4);

            for(Object key : myMap.keySet()){
                Person p = myMap.get(key);
                System.out.println(key + " " + p.getFirstname() + "" + p.getSurname());

            }

            Map<String, List<Person>> myMap2 = new HashMap<>();

            //List<Person> people = new ArrayList<>();
          //  Set<Person> people = new Hashset<>();

          /*   people.add(person1);
            people.add(person2);
            people.add(person3);
            people.add(person1);

            for(Person p : people){
                System.out.println(p.getFirstname() + " " + p.getSurname());
            }*/


}
}
