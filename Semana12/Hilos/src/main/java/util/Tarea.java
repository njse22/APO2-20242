package util;

public class Tarea  implements Runnable {

    private String name;
    private int counter;

    public Tarea(String name){
        this.name = name;
    }

    @Override
    public void run() {
        ++counter;
        System.out.println("Hola desde el Runnable: " + name + "Counter: " + counter);
        setName("Nuevo nombre ");
        System.out.println("Hola desde el Runnable: " + name + "Counter: " + counter);
    }

    public void setName(String name){
        this.name = name;
    }
}
