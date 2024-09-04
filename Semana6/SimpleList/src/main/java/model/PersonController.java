package model;

import structures.SimpleLinkedListPerson;

public class PersonController {

    private SimpleLinkedListPerson people;

    public PersonController(){
        people = new SimpleLinkedListPerson();
    }

    public void addPerson(String name, int age){
        Person person = new Person(name, age);
        people.add(name, person);
    }

    public SimpleLinkedListPerson getPeople() {
        return people;
    }
}
