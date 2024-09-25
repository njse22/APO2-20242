package ui;

import model.PersonController;

public class Main {

    public static void main(String[] args) {
        PersonController controller = new PersonController();
        controller.addPerson("A0", "01");
        controller.addPerson("A1", "02");
        controller.addPerson("A2", "03");
        controller.addPerson("A3", "04");
        controller.addPerson("A4", "05");

        System.out.println(controller.printPeople());
        System.out.println(controller.alternativePrint());
    }
}
