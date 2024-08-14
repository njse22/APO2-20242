package ui;

import control.PersonController;
import exceptions.PersonNegativeAgeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // Asociación
    // private PersonController controller;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Dependencia
        PersonController controller = new PersonController();

        System.out.println("name: ");
        String name = s.nextLine();
        System.out.println("cc: ");
        String cc = s.nextLine();
        System.out.println("age: ");
        int age = s.nextInt();

        try {
            controller.addPerson(name, cc, age);
        }catch (PersonNegativeAgeException ex){
            // System.out.println(e.getMessage());
            System.err.println(ex.getMessage());
            //e.printStackTrace();
        }
        finally {
            System.out.println("");
        }

        System.out.println("name: ");
        name = s.nextLine();
        System.out.println("cc: ");
        cc = s.nextLine();
        System.out.println("age: ");
        age = s.nextInt();

        controller.addPerson2(name, cc, age);


        /*

        try {
            System.out.println("Valor de a:");
            int a = s.nextInt();
            System.out.println("Valor de b:");
            int b = s.nextInt();

            System.out.println(a/b);

        }catch (InputMismatchException e){
            System.out.println("Debe ingresar valores numericos");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }

        */


       // // proceso previo
       // System.out.println("value of a: ");
       // int a = s.nextInt();

       // System.out.println("value of b: ");
       // int b = s.nextInt();

       // // Bloque de control
       // try {
       //     // proceso a ejecutar
       //     System.out.println(a/b);
       // }catch (ArithmeticException arithmetic){

       //     // contingencia
       //     System.out.println("No se puede dividir por 0");

       //     System.out.println("value of a: ");
       //     a = s.nextInt();

       //     System.out.println("value of b: ");
       //     b = s.nextInt();

       //     System.out.println(a/b);
       // }
    }
}
