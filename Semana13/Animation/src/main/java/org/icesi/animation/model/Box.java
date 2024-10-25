package org.icesi.animation.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Box {

    private Canvas canvas;
    private GraphicsContext graphicsContext;

    private Position position;

    public Box(Canvas canvas){
        this.canvas = canvas;
        this.position = new Position(25, 25);
        graphicsContext = canvas.getGraphicsContext2D();
    }

    public void paint(){
        graphicsContext.setFill(Color.RED);
        graphicsContext.fillRect(position.getX(), position.getY(), 50, 50);
    }
}
