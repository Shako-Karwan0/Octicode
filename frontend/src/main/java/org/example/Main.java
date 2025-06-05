package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        // Create a simple shape (Circle)
        Circle circle = new Circle(100, 100, 50);

        // Add the circle to the root group
        Group root = new Group(circle);

        // Set up the scene
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX Without Controls");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
