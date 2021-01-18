package me.tuhin.designprincipals.template.howtodoinjava;

public class GlassWallHouse extends House {
    @Override
    protected void decorateHouse() {
        System.out.println("Decorating Glass Wall House");
    }

    @Override
    protected void paintHouse() {
        System.out.println("Painting Glass Wall House");
    }

    @Override
    protected void constructDoors() {
        System.out.println("Constructing Doors for Glass Wall House");
    }

    @Override
    protected void constructWindows() {
        System.out.println("Constructing Windows for Glass Wall House");
    }

    @Override
    protected void constructWalls() {
        System.out.println("Constructing Glass Wall for my House");
    }
}
