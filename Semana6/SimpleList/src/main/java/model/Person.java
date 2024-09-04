package model;

import structures.SimpleLinkedListPerson;
import structures.SimpleLinkedListPet;

public class Person {
    private String name;
    private int age;

    private SimpleLinkedListPet pets;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        pets = new SimpleLinkedListPet();
    }

    public void addPet(String name, int age){
        Pet pet = new Pet(name, age);
        pets.add(name, pet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
