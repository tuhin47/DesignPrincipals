package me.tuhin.designprincipals.template.howtodoinjava;

public class ConcreteWallHouse extends House {
    @Override
    protected void decorateHouse() {
        System.out.println("Decorating Concrete Wall House");
    }

    @Override
    protected void paintHouse() {
        System.out.println("Painting Concrete Wall House");
    }

    @Override
    protected void constructDoors() {
        System.out.println("Constructing Doors for Concrete Wall House");
    }

    @Override
    protected void constructWindows() {
        System.out.println("Constructing Windows for Concrete Wall House");
    }

    @Override
    protected void constructWalls() {
        System.out.println("Constructing Concrete Wall for my House");
    }
}
