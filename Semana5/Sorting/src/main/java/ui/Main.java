package ui;

import control.PersonController;
import model.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PersonController controller = new PersonController();

        controller.createPerson("Name5", 50, "A50") ;
        controller.createPerson("Name3", 30, "A30") ;
        controller.createPerson("Name4", 40, "A40") ;
        controller.createPerson("Name2", 20, "A20") ;
        controller.createPerson("Name1", 10, "A10") ;

        System.out.println(controller.getPeople());
        System.out.println("**********************************************");

        //ArrayList<Person> sorted = controller.selectionSort(controller.getPeople());
        ArrayList<Person> sorted = controller.insertionSort(controller.getPeople());

        System.out.println(sorted);
    }
}
