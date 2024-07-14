package org.example.part14.app10;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.*;

public class AsteroidsApplication extends Application {

    static Random random = new Random();
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(900, 600);

        Ship ship = new Ship(150, 100);
        List<Asteroid> asteroids = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Asteroid asteroid = new Asteroid(random.nextInt(100), random.nextInt(100));

            asteroids.add(asteroid);
        }

        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));

        Scene scene = new Scene(pane);

        animationForMovingTheShip(scene, ship, asteroids);

        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }



    private static void animationForMovingTheShip(Scene scene, Ship ship, List<Asteroid> asteroids) {
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();

        scene.setOnKeyPressed(event -> {
            pressedKeys.put(event.getCode(), Boolean.TRUE);
        });

        scene.setOnKeyReleased(event -> {
            pressedKeys.put(event.getCode(), Boolean.FALSE);
        });

        new AnimationTimer() {

            @Override
            public void handle(long now) {
                if(pressedKeys.getOrDefault(KeyCode.LEFT, false)) {
                    ship.turnLeft();
                }

                if(pressedKeys.getOrDefault(KeyCode.RIGHT, false)) {
                    ship.turnRight();
                }

                if(pressedKeys.getOrDefault(KeyCode.UP, false)) {
                    ship.accelerate();
                }

                ship.move();
                asteroids.forEach(Character::move);

                asteroids.forEach(asteroid -> {
                    if (ship.collide(asteroid)) {
                        stop();
                    }
                });
            }
        }.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
