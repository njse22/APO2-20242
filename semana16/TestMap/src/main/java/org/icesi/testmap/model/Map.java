package org.icesi.testmap.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Map {
    
    private Canvas canvas;
    private GraphicsContext gc;

    private Avatar avatar;

    private int tileSize;

    public Map(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
        this.tileSize = 50;
        this.avatar = new Avatar(new Position(75, 75), canvas);

    }

    private final int[][] map = {
            {1, 1, 0, 0, 0},
            {0, 1, 0, 1, 1},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 0, 0}
    }; // 1 = Camino, 0 = Obstáculo

    public void pain(){

        // Dibujar el mapa
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == 1) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(x * tileSize, y * tileSize, tileSize, tileSize);
                } else {
                    gc.setFill(Color.GREEN);
                    gc.fillRect( x * tileSize, y * tileSize, tileSize, tileSize);
                }
            }
        }

        avatar.pain();
    }

    public void setOnKeyPressed(KeyEvent e){
        avatar.setOnKeyPressed(e);
    }

    public void setOnKeyReleased(KeyEvent e){
        avatar.onKeyReleased(e);
    }
}
