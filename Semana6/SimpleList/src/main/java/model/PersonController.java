package model;

import structures.SimpleLinkedListPerson;

import java.util.Comparator;

public class PersonController {

    private SimpleLinkedListPerson people;

    public PersonController(){
        people = new SimpleLinkedListPerson();
    }

    public void addPerson(String name, int age){
        Person person = new Person(name, age);
        people.add(name, person);
    }

    public void selectionSort(Comparator<Person> comparator){
        int n = people.getSize();
        for (int i = 0; i < n - 1; i++){
            for (int j = i+1; j < n; j++){
                if (comparator.compare(people.get(i).getValue(), people.get(j).getValue()) > 0){

                    //Person prev = toSort.get(i);
                    //Person current = toSort.get(j);

                    //toSort.set(i, current);
                    //toSort.set(j, prev);
                }
            }
        }
    }


    public SimpleLinkedListPerson getPeople() {
        return people;
    }
}
