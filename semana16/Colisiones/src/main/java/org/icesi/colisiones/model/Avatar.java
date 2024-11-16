package org.icesi.colisiones.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Avatar {

    private Canvas canvas;
    private GraphicsContext gc;

    private Position position;

    private boolean up;
    private boolean down;
    private boolean right;
    private boolean left;

    public Avatar(Position position, Canvas canvas) {
        this.position = position;
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    public void paint(){
        onMove();
        gc.setFill(Color.BLUE);
        gc.fillRect(position.getX(), position.getY(), 25, 25);
    }

    public void setOnKeyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getCode()){
            case A -> {
                System.out.println("Tecla A");
            }
            case UP    -> up = true;
            case DOWN  -> down = true;
            case RIGHT -> right = true;
            case LEFT  -> left = true;
        }
    }

    public void setOnKeyRelesed(KeyEvent keyEvent) {
        switch (keyEvent.getCode()){
            case UP    -> up = false;
            case DOWN  -> down = false;
            case RIGHT -> right = false;
            case LEFT  -> left = false;
        }
    }


    public void onMove(){
        if (up){
            position.setY(position.getY() - 10);
        }
        if (down){
            position.setY(position.getY() + 10);
        }
        if (right){
            position.setX(position.getX() + 10);
        }
        if (left){
            position.setX(position.getX() - 10);
        }
    }

    public Position getPosition() {
        return position;
    }
}
