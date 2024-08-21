package ui;

import control.PersonController;

import java.io.File;

public class Main {

    private PersonController controller;

    public Main(){
        controller = new PersonController();
    }

    public static void main(String[] args) {

        Main main = new Main();

        main.controller.createPerson("Name1", 10, "A01");
        main.controller.createPerson("Name2", 20, "A02");
        main.controller.createPerson("Name3", 30, "A03");
        System.out.println(main.controller.getPeople());

        main.controller.save();
        main.controller.clearList();
        System.out.println(main.controller.getPeople());

        main.controller.load();

        System.out.println(main.controller.getPeople());
        System.out.println(main.controller.getPeople().get(0).getAge());





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
