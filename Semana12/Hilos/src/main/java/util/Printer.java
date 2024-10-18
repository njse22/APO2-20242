package util;

public class Printer {

    public synchronized static void printMessage(){
        System.out.println("Hola desde el printer");
        for (int i = 0; i < 10; i++) {
            System.out.println("Print: " + i);
        }
    }
}
