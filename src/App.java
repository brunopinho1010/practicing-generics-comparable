import java.util.Collections;

import entities.Person;
import service.PersonService;

public class App {
    public static void main(String[] args) throws Exception {
      
        
        PersonService<Person> ps = new PersonService<>();
        ps.add(new Person("bruno", 100.00));
        ps.add(new Person("oliver", 220.00)); 
        ps.add(new Person("raimundo", 233.00)); 
        ps.add(new Person("jose", 242.00)); 
        ps.add(new Person("leticia", 412.00)); 
        ps.first();
        System.out.println("------------------------------"); 
        Collections.sort(ps.getList());
        for (Person person : ps.getList()) {
            System.out.println(person);
        }
        System.out.println("------------------------------"); 
     
    }
}
