package control;

import exceptions.PersonNegativeAgeException;
import exceptions.PersonNegativeAgeRuntimeException;
import model.Person;

import java.util.ArrayList;

public class PersonController {

    private ArrayList<Person> people;

    public PersonController() {
        this.people = new ArrayList<>(5);
    }

    public void addPerson(String name, String cc, int age) throws PersonNegativeAgeException {
        Person p = new Person(name, cc, age);

        if(age < 0){
            throw new PersonNegativeAgeException("La edad no puede ser negativa");
        }
        people.add(p);
    }

    public void addPerson2(String name, String cc, int age){
        Person p = new Person(name, cc, age);

        if(age < 0){
            throw new PersonNegativeAgeRuntimeException("Runtime exception la edad no puede ser negativa");
        }
        people.add(p);
    }


}
