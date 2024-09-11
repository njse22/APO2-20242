package ui;

import controller.PersonController;

public class main {
    public static void main(String[] args) {
        PersonController controller = new PersonController();

        controller.addPerson("A0", 10);
        controller.addPerson("A1", 20);
        controller.addPerson("A2", 30);
        controller.addPerson("A3", 40);

        int pos = controller.binarySearch("A2");
        System.out.println(pos);

    }
}
