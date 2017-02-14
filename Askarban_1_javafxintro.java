/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askarban_1_javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Askarban_1_javafxintro extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawShapes(gc);

        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        drawStar(gc); 
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    void drawStar(GraphicsContext gc) {
        gc.setFill(Color.RED);
        gc.setStroke(Color.RED);
        double[] xPoints = {10, 45, 10, 27, 45, 10};
        double[] yPoints = {40, 40, 90, 10, 90, 40}; 
            gc.strokePolygon(xPoints, yPoints, 6);

    }
                   private void drawShapes(GraphicsContext gc) {
                  gc.setFill(Color.GREEN);
                  gc.setStroke(Color.BLUE);
                  gc.setLineWidth(5);
                  gc.strokeLine(40, 10, 10, 40);
                  gc.fillOval(10, 60, 30, 30);
                  gc.strokeOval(60, 60, 30, 30);
                  gc.fillRoundRect(110, 60, 30, 30, 10, 10);
                  gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
                  gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
                  gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
                  gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
                  gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
                  gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
                  gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
                  gc.fillPolygon(new double[]{10, 40, 10, 40},
                     new double[]{210, 210, 240, 240}, 4);
                  gc.strokePolygon(new double[]{60, 90, 60, 90},
                     new double[]{210, 210, 240, 240}, 4);
                  gc.strokePolyline(new double[]{110, 140, 110, 140},
                     new double[]{210, 210, 240, 240}, 4);
    }
}
