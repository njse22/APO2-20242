package util;

public class Counter extends Thread {

    private int time;
    private String name;

    public Counter(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Mensaje del Hilo counter >>" + this.name);
        while(true){
            try {
                time++;
                Thread.sleep(1000);

            }catch (InterruptedException e){
               e.printStackTrace();
            }
            System.out.println("Time: " + time + " >>> " + this.name);
        }
    }
}
