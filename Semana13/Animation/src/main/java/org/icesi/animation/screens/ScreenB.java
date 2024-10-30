package org.icesi.animation.screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import org.icesi.animation.HelloApplication;
import org.icesi.animation.control.HelloController;
import org.icesi.animation.model.Avatar;
import org.icesi.animation.model.Position;
import org.icesi.animation.util.IDistance;

public class ScreenB extends BaseScreen{

    private Avatar avatar;

    public ScreenB(Canvas canvas){
        super(canvas);
        this.avatar = new Avatar(super.canvas);
    }

    @Override
    public void paint() {
        super.gc.setFill(Color.GRAY);
        super.gc.fillRect(0,0, super.canvas.getWidth(), super.canvas.getHeight());
        avatar.paint();

        IDistance iDistance = (from, to) -> {
            return Math.sqrt(
              Math.abs(
                      Math.pow(from.getX() - to.getX(), 2) +
                              Math.pow(from.getY() - to.getY(), 2)
              )
            );
        };

        double distance = iDistance.distance(avatar.getPosition(),
                new Position(0, 0));

        System.out.println(distance);

        if (distance < 40){
            HelloController.SCREEN = 0;
        }
    }

    @Override
    public void onKeyPressed(KeyEvent event) {
        avatar.setOnKeyPressed(event);
    }

    @Override
    public void onKeyReleased(KeyEvent event) {
        avatar.setOnKeyPressed(event);
    }
}
