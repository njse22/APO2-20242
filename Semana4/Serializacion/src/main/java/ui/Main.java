package ui;

import control.PersonController;
import model.PersonCCComparator;

import java.io.File;
import java.util.Collections;

public class Main {

    private PersonController controller;

    public Main(){
        controller = new PersonController();
    }

    public static void main(String[] args) {

        Main main = new Main();


        main.controller.createPerson("Name6", 50, "A06");
        main.controller.createPerson("Name3", 30, "A03");
        main.controller.createPerson("Name1", 10, "A01");
        main.controller.createPerson("Name5", 40, "A05");
        main.controller.createPerson("Name2", 20, "A02");
        main.controller.createPerson("Name4", 40, "A04");

        System.out.println(main.controller.getPeople());

        // main.controller.save();
        // main.controller.clearList();
        System.out.println(main.controller.getPeople());

        // main.controller.load();

        System.out.println(main.controller.getPeople());
        // System.out.println(main.controller.getPeople().get(0).getAge());


        System.out.println(
                main.controller.getPeople().get(3).compareTo(
                main.controller.getPeople().get(4)
        ));

        System.out.println("*************************");
        System.out.println(main.controller.getPeople());

        // Se le da una lista de personas, esa clase persona
        // debe tener definido un criterio de comparación interno
        // la calse persona debe ser Comparable
        Collections.sort(main.controller.getPeople());


        // Definir un comparador externo a la clase Persona
        // comparar personas en base a su cedula
        // Collections.sort -> ordenar en base a el criterio
        // de comparación del comparetor
        PersonCCComparator comparator = new PersonCCComparator();
        Collections.sort(main.controller.getPeople(), comparator);

        System.out.println(main.controller.getPeople());

        /**

        File projectDir = new File(System.getProperty("user.dir"));
        System.out.println("Variable project: " + projectDir);
        System.out.println("Variable adsolute path: " + projectDir.getAbsolutePath());
        System.out.println("Variable path: " + projectDir.getPath());
        System.out.println("Variable name: " + projectDir.getName());


        File data = new File(projectDir+"/src/main/data");

        System.out.println(data.exists());
        data.mkdir();
        System.out.println(data.exists());
         */
    }
}
