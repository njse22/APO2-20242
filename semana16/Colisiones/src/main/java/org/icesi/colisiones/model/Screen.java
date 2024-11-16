package org.icesi.colisiones.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

public class Screen {

    private Canvas canvas;
    private GraphicsContext gc;

    private Avatar avatar;
    private Box box;

    public Screen(Canvas canvas){
        this.canvas = canvas;
        avatar = new Avatar(new Position(50, 50), canvas);
        box = new Box(canvas);
        gc = canvas.getGraphicsContext2D();
    }

    public void paint(){
        avatar.paint();
        box.paint();

        double d = calculateDistance(avatar.getPosition(), box.getPosition());

        System.out.println(d);

    }

    public double calculateDistance(Position from, Position to){
        return Math.sqrt(
                Math.pow(from.getX() - to.getX(), 2) + Math.pow(from.getY() - to.getY(), 2)
        );
    }

    public void setOnKeyReleased(KeyEvent e){
        avatar.setOnKeyRelesed(e);
    }

    public void setOnKeyPressed(KeyEvent e){
        avatar.setOnKeyPressed(e);
    }
}
