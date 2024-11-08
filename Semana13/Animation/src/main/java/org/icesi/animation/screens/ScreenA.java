package org.icesi.animation.screens;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import org.icesi.animation.control.HelloController;
import org.icesi.animation.model.Avatar;
import org.icesi.animation.model.Box;
import org.icesi.animation.model.Position;
import org.icesi.animation.util.IDistance;

import java.util.ArrayList;

public class ScreenA extends BaseScreen {

    private Avatar avatar;
    private Box box1;

    private ArrayList<Box> boxes;

    public ScreenA(Canvas canvas) {
        super(canvas);
        this.avatar = new Avatar(super.canvas);
        this.box1 = new Box(super.canvas);
        boxes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            boxes.add(new Box(super.canvas));
        }
    }

    @Override
    public void paint(){
        super.gc.setFill(Color.BLACK);
        super.gc.fillRect(0, 0, super.canvas.getWidth(), super.canvas.getHeight());
        box1.paint();
        avatar.paint();

       // if(!box1.isAlive()){
       //     box1.start();
       // }

        IDistance iDistance = (from, to) -> {
            //
            return Math.sqrt(
                        Math.pow(from.getX() - to.getX(), 2) +
                                Math.pow(from.getY() - to.getY(), 2)
            );
        };

        for (Box box : boxes) {
            double disBox = iDistance.distance(box.getPosition(), avatar.getPosition());
            System.out.println(box + " : " + disBox);
        }

        double distance = iDistance.distance(avatar.getPosition(), box1.getPosition());

        System.out.println(distance);

        System.out.println(avatar.getPosition().getX());

        if (avatar.getPosition().getX() < 0){
            avatar.getPosition().setX(0);
        }

        if (distance < 40){

            // se calcula la diferencia de posición entre los dos elementos
            double posX = avatar.getPosition().getX() - box1.getPosition().getX();
            double posY = avatar.getPosition().getY() - box1.getPosition().getY();

            // se define un vector de diferencia
            Position diff = new Position(posX, posY);

            // se normaliza el vector
            diff.normalize();
            // y se multiplica por un scalar para que el cambio de
            // posición no sea de 1 en 1 si no de el valor del scalar
            diff.setSpeed(4);

            // a la posición actual del elemento que queremo mover, hacemos
            // que varie, en la diferencia de elementos
            box1.getPosition().setX(box1.getPosition().getX() + diff.getX());
            box1.getPosition().setY(box1.getPosition().getY() + diff.getY());

            /*
            *     diff
            *  A ------> B
            * */
        }

    }

    @Override
    public void onKeyPressed(KeyEvent event){
        avatar.setOnKeyPressed(event);

        if (event.getCode() == KeyCode.SPACE){
            HelloController.SCREEN = 1;
        }
    }

    @Override
    public void onKeyReleased(KeyEvent event){
        avatar.onKeyReleased(event);
    }
}
