package org.icesi.animation.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.security.Key;
import java.util.ArrayList;

public class Avatar {

    private Canvas canvas;
    private GraphicsContext graphicsContext;
    private Position position;

    // 0 = idle | 1 = run
    private int state;
    private int frame;

    private ArrayList<Image> idles;
    private ArrayList<Image> runs;

    // actions
    private boolean upPressed;
    private boolean down;
    private boolean right;
    private boolean left;

    private boolean sPressed;
    private boolean aPressed;


    public Avatar(Canvas canvas){
        this.canvas = canvas;
        this.graphicsContext = canvas.getGraphicsContext2D();
        position = new Position(100, 100);
        idles = new ArrayList<>();
        runs = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Image idle = new Image(getClass().getResourceAsStream("/animation/hero/idle/adventurer-idle-2-0"+i+".png"));
            idles.add(idle);
        }
        for (int i = 0; i < 5; i++) {
            Image run = new Image(getClass().getResourceAsStream("/animation/hero/run/adventurer-run-0"+i+".png"));
            runs.add(run);
        }
    }

    public void paint(){
        onMove();
        if(state == 0){
            graphicsContext.drawImage(idles.get(frame%3), position.getX(), position.getY());
            frame++;
        }
        else if(state == 1){
            graphicsContext.drawImage(runs.get(frame%5), position.getX(), position.getY());
            frame++;
        }
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
        switch (event.getCode()){
           case UP -> {state = 1; upPressed = true; }
           case DOWN -> {state = 1; down = true;}
           case RIGHT -> {state= 1; right = true;}
           case LEFT -> {state = 1; left = true;}
            case A -> {state = 1; aPressed = true;}
            case S -> {state = 1; sPressed = true;}
        }

        if (aPressed && sPressed){
            System.out.println("Here");
        }
    }

    public void onKeyReleased(KeyEvent event){
        switch (event.getCode()){
            case A -> System.out.println("Tecla A");
            case UP -> {state= 0; upPressed = false;}
            case DOWN -> {state = 0; down = false;}
            case RIGHT -> {state = 0; right = false;}
            case LEFT -> {state= 0; left = false;}
        }
    }

    public Position getPosition() {
        return position;
    }
}
