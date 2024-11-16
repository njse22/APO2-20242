package org.icesi.testmap;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import org.icesi.testmap.model.Map;
import org.icesi.testmap.model.MapCreator;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Canvas canvas;

    private MapCreator mapCreator;
    private Map map;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mapCreator = new MapCreator(canvas);
        new Thread(() -> {
            Platform.runLater( () -> {
                mapCreator.pain();
            });
        }).start();

        System.out.println("HHH");
        //initEvents();
    }

    public void initEvents() {
        canvas.setOnKeyPressed(event -> {
           map.setOnKeyPressed(event);
        });

        canvas.setOnKeyReleased(event -> {
            map.setOnKeyReleased(event);
        });
    }
}