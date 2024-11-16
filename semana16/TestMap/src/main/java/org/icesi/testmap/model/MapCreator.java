package org.icesi.testmap.model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MapCreator {

    private Canvas canvas;
    private GraphicsContext gc;

    public MapCreator(Canvas canvas) {
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();
    }

    private int[][] adjacencyMatrix = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0}
    };

    private double[][] nodeCoordinates = {
            {100, 100}, // Node 0
            {200, 100}, // Node 1
            {200, 200}, // Node 2
            {100, 200}, // Node 3
            {50, 150}   // Node 4
    };

    public void pain() {
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);

        // Draw edges
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    double x1 = nodeCoordinates[i][0];
                    double y1 = nodeCoordinates[i][1];
                    double x2 = nodeCoordinates[j][0];
                    double y2 = nodeCoordinates[j][1];
                    gc.strokeLine(x1, y1, x2, y2);
                }
            }
        }

        // Draw nodes
        gc.setFill(Color.RED);
        for (double[] coordinate : nodeCoordinates) {
            double x = coordinate[0];
            double y = coordinate[1];
            gc.fillOval(x - 10, y - 10, 20, 20); // Draw node as a circle
        }
    }

}
