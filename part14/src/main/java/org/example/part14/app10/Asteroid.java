package org.example.part14.app10;

import javafx.scene.shape.Polygon;

import java.util.Random;

public class Asteroid extends Character{

    private double rotationalMovement;
    private final Random random = new Random();

    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);

        super.getCharacter().setRotate(random.nextInt(360));

        int accelerationAmount = 1 + random.nextInt(10);

        for (int i = 0; i < accelerationAmount; i++) {
            accelerate();
        }

        this.rotationalMovement = 0.5 - random.nextDouble();
    }

    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }
}
