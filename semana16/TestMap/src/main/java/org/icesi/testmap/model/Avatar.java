package org.icesi.testmap.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Avatar {

    private Position position;

    private Canvas canvas;
    private GraphicsContext gc;

    // actions
    private boolean upPressed;
    private boolean down;
    private boolean right;
    private boolean left;

    public Avatar(Position position, Canvas canvas) {
        this.position = position;
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    public void pain(){
        onMove();
        gc.setFill(Color.BLUE);
        gc.fillRect(position.getX(), position.getY(), 25, 25);
    }

    public void onMove(){
        if (upPressed){
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

    public void setOnKeyPressed(KeyEvent event){
        System.out.println(event.getCode());
        switch (event.getCode()){
            case UP ->    {upPressed = true; }
            case DOWN ->  {down = true;}
            case RIGHT -> {right = true;}
            case LEFT ->  {left = true;}
        }

    }

    public void onKeyReleased(KeyEvent event){
        switch (event.getCode()){
            case UP ->    {upPressed = false;}
            case DOWN ->  {down = false;}
            case RIGHT -> {right = false;}
            case LEFT ->  {left = false;}
        }
    }


}
