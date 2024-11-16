package model;

public class CustomRunnable implements Runnable {

    private String name;

    public CustomRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola desde el runnable: " + this.name + " : " + i);
        }
    }
}
