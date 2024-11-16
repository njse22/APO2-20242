package model;

public class CustomThread extends Thread {

    @Override
    public void run(){

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from custom thread run method: " + i);
        }

    }
}
