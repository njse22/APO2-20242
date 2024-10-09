package org.icesi.introjavafx.control;

import org.icesi.introjavafx.exceptions.PersonAlreadyCreatedException;
import org.icesi.introjavafx.model.Person;

import java.util.ArrayList;

public class PersonController {

    private ArrayList<Person> people;

    public PersonController(){
        people = new ArrayList<>();
    }

    public void addPerson(String name, String code) throws PersonAlreadyCreatedException {
        Person person = new Person(name, code);
        people.add(person);
        // Forzamos el como se lanza la excepción
        if(name.equalsIgnoreCase("exit")){
            throw new PersonAlreadyCreatedException("La persona ya esta creada");
        }
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public String printPeople(){
        String msg = "";
        for (Person person : people){
            msg += person.toString() + "\n";
        }

        return msg;
    }
}
