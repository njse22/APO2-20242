package model;

import structures.CircularList;

public class PersonController {

    private CircularList<Person> people;

    public PersonController(){
        people = new CircularList<>();
    }


    public void addPerson(String name, String cc){
        Person person = new Person(name, cc);
        people.add(person);
    }

    public String printPeople(){
        return people.printList();
    }

    public String alternativePrint(){
        return people.getFirst().printList();
    }

}
