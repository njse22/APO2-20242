package org.icesi.animation.screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import org.icesi.animation.model.Avatar;

public class ScreenA {

    private Canvas canvas;
    private GraphicsContext graphicsContext;
    private Avatar avatar;

    public ScreenA(Canvas canvas) {
        this.canvas = canvas;
        this.graphicsContext = this.canvas.getGraphicsContext2D();
        this.avatar = new Avatar(this.canvas);
    }

    public void paint(){
        graphicsContext.setFill(Color.BLACK);
        graphicsContext.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        avatar.paint();
    }

    public void onKeyPressed(KeyEvent event){
        avatar.setOnKeyPressed(event);
    }

    public void onKeyReleased(KeyEvent event){
        avatar.onKeyReleased(event);
    }
}
