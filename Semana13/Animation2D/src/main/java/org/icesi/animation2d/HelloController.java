package org.icesi.animation2d;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas canvas;
    private GraphicsContext graphicsContext;

    private Rectangle rec1;
    private Rectangle rec2;

    private double posX;
    private double posY;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Hola desde el controlador");
        graphicsContext = canvas.getGraphicsContext2D();

        rec1 = new Rectangle(0, 50, 50, 50);
        rec2 = new Rectangle(100, 50, 50, 50);



        // Hilo
        new Thread(
                // Runable --> Lambda
                () -> {
                    while (true){
                        // Hilo de la librería
                        Platform.runLater(() -> {

                            // Limpiar el canvas
                            graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                            // pintando los elementos
                            graphicsContext.setFill(Color.BLUE);
                            graphicsContext.fillRect(rec1.getX(), rec1.getY(), rec1.getWidth(), rec1.getHeight());

                            graphicsContext.setFill(Color.RED);
                            graphicsContext.fillRect(rec2.getX(), rec2.getY(), rec2.getWidth(), rec2.getHeight());

                        });

                        // Reference: https://www.omnicalculator.com/math/distance
                        IDistance cal = (x1, x2, y1, y2) -> {
                            return  Math.sqrt( Math.abs(
                                    (Math.pow(x1, 2) - Math.pow(x2, 2)) + (Math.pow(y1, 2) - Math.pow(y2, 2))
                            ));
                        };

                        double distance = cal.calculateDistance(rec1.getX(), rec2.getX(), rec1.getY(), rec2.getY());
                        System.out.println(" Distance: " + distance);

                        if (distance < 20){
                           posY = rec1.getY() + 5;
                           rec1.setY(posY);
                        }
                        else {
                            posX = rec1.getX() + 1;
                            rec1.setX(posX);
                        }

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        ).start();

    }
}