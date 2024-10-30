package org.icesi.animation.model;

public class Position {
    private double x;
    private double y;

    public Position(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void normalize(){
        double normal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if(normal != 0){
            x /= normal;
            y /= normal;
        }
    }

    public void setSpeed(int speed){
        x *= speed;
        y *= speed;
    }

}
