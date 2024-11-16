package org.icesi.colisiones.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Box extends Thread {

    private Canvas canvas;
    private GraphicsContext graphicsContext;

    private double y;
    private Position position;

    public Box(Canvas canvas){
        this.canvas = canvas;
        this.position = new Position(200, 200);
        graphicsContext = canvas.getGraphicsContext2D();
        this.y = position.getY();
    }

    @Override
    public void run(){
        while (true){
            try {
                position.setY(++y);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void paint(){
        graphicsContext.setFill(Color.RED);
        graphicsContext.fillRect(position.getX(), position.getY(), 50, 50);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}