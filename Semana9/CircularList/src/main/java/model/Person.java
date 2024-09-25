package model;

import structures.CircularList;

public class Person {
    private String name;
    private String cc;

    private CircularList<Pet> pets;


    public Person(String name, String cc) {
        this.name = name;
        this.cc = cc;
        this.pets = new CircularList<>();
    }

    public void addPet(String name){
       Pet pet = new Pet(name);
       pets.add(pet);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cc='" + cc + '\'' +
                '}';
    }
}
