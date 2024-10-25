package org.icesi.gifbackground;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas canvas;
    private GraphicsContext graphicsContext;
    private Image gifImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.graphicsContext = canvas.getGraphicsContext2D();

        gifImage = new Image(getClass().getResource("/animations/background/back.gif").toExternalForm());

        new Thread(() -> {
            while (true) {
                Platform.runLater(() -> {
                    graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
                    graphicsContext.drawImage(gifImage, 0, 0, gifImage.getWidth(), gifImage.getHeight(),
                            0, 0, canvas.getWidth(), canvas.getHeight());
                });
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}