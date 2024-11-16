package org.icesi.colisiones;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import org.icesi.colisiones.model.Screen;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas canvas;
    private GraphicsContext gc;

    private Screen screen;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        screen = new Screen(this.canvas);

        new Thread(
                () -> {
                    while (true){
                        Platform.runLater(
                                () -> {
                                    screen.paint();
                                }
                        );
                    }
                }
        ).start();
        initEvents();
    }

    public void initEvents(){
        canvas.setOnKeyReleased(event -> {
            screen.setOnKeyReleased(event);
        });

        canvas.setOnKeyPressed(event -> {
            screen.setOnKeyPressed(event);
        });
    }
}