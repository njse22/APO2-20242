package controller;

import model.Person;

import java.util.ArrayList;

public class PersonController {
    private ArrayList<Person> people;

    public PersonController() {
        people = new ArrayList<>();
    }

    public void addPerson(String name, int age){
        Person person = new Person(name, age);
        people.add(person);
    }

    public int binarySearch(String name){
        // ordenamiento

        int found = -1;
        int start = 0;
        int end = people.size() - 1;
        int mid = (start + end)/2;

        while (start <= end && found != mid){
            if(people.get(mid).getName().equals(name)){
                found = mid;
            }

            // Sub arreglo inferior
            else if(people.get(mid).getName().compareTo(name) > 0){
                start = 0;
                end = mid-1;
                mid = (start + end) / 2;
            }

            // sub arreglo superior
            else if (people.get(mid).getName().compareTo(name) < 0) {
                start = mid+1;
                end = people.size()-1;
                mid = (start + end) / 2;
            }
        }
        return found;
    }
}
