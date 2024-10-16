package org.icesi.tableview.controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import org.icesi.tableview.model.Person;

public class PersonController {

    private static PersonController instance;
    public ObservableList<Person> people;

    private PersonController(){
        people = FXCollections.observableArrayList();
    }

    public static PersonController getInstance(){
        if(instance == null){
            instance = new PersonController();
        }
        return instance;
    }

    public void addPerson(String name, String id, int age){
        Person person = new Person(name, id, age);
        people.add(person);

    }

    public ObservableList<Person> getPeople() {
        return people;
    }
}
