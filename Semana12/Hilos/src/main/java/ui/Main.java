package ui;

import util.Counter;
import util.FunctionalInterfaceExample;
import util.Printer;
import util.Tarea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;



public class Main {
    public static void main(String[] args) {

        Counter c1 = new Counter("Counter 1");
        //c1.start();

        // createThreads();

        Tarea t = new Tarea("Tarea 1");

        //for (int i = 0; i < 10; i++) {
        //    Thread t1 = new Thread(t);
        //    t1.start();
        //}

        Thread t2 = new Thread( () -> {
            System.out.println("Lambda");
        });

        //t2.start();

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {

            System.out.println(" Execute: "+i);
            pool.execute( () -> {
                System.out.println("Hola");
            });
        }



        FunctionalInterfaceExample interfaceExample1 = new FunctionalInterfaceExample() {
            @Override
            public void onHello() {
                System.out.println("Hola desde la versión anterior");
            }
        };

        FunctionalInterfaceExample interfaceExample = () -> {
            System.out.println("Hola desde la Funtional Interface");
        };

        interfaceExample.onHello();
        interfaceExample1.onHello();



        Counter c2 = new Counter("Counter 2");
        // c2.start();
    }

    public static void createThreads(){

        for (int i = 0; i < 10; i++) {

            //try {
            System.out.println("Hola desde el main: " + i);

            // ejecutar un hilo con una tarea definida en un metodo estatico
            new Thread(Printer::printMessage).start();

            //Thread.sleep(1);

            //}
            //catch (InterruptedException e){
            //    e.printStackTrace();
            //}
        }
    }

}
