package ui;

import model.PersonController;

public class Main {
    public static void main(String[] args) {
        PersonController controller = new PersonController();

        controller.addPerson("name10", 10);
        controller.addPerson("name20", 20);
        controller.addPerson("name30", 30);

        System.out.println(controller.getPeople().search("name20"));
    }
}
