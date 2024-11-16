package ui;

import model.CustomFuntionalInterface;
import model.CustomRunnable;
import model.CustomThread;

public class Main {

    public static void main(String[] args) {
        CustomThread ct = new CustomThread();
        CustomThread ct2 = new CustomThread();

        //ct.start();
        //ct2.start();

        Thread t1 = new Thread(Main::print);
        Thread t2 = new Thread(Main::print);

        //t1.start();
        //t2.start();

        CustomRunnable r1 = new CustomRunnable("R1");

        //Thread runnableThread1 = new Thread(r1);

        //runnableThread1.start();

        // Version java < 8
        CustomFuntionalInterface cfi = new CustomFuntionalInterface() {
            @Override
            public void printer() {
                System.out.println("Hola desde el estilo viejo");
            }
        };

        // java > 8 || java > 11
        CustomFuntionalInterface cfi2 = () -> {
            System.out.println("Hola desde el estilo lambda");
        };

        cfi.printer();
        cfi2.printer();


        Thread tf = new Thread( () -> {
            System.out.println("Hola desde el hilo con una lambda ");
        } );

        tf.start();

        System.out.println("Hola desde el main");
    }


    public synchronized static void print(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Main: " + i);
        }
    }
}
