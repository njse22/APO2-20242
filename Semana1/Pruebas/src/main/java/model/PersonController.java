package model;


import java.util.ArrayList;

public class PersonController {

    private ArrayList<Person> people;

    public PersonController(){
        people = new ArrayList<>(5);
    }

    public void addPerson(String name, int age, String cc, double weight){
        Person person = new Person(name, age, cc, weight);
        people.add(person);
    }


    public ArrayList<Person> getPeople(){
        return people;
    }


}
