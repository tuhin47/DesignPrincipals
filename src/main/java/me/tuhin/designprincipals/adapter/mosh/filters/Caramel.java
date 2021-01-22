package me.tuhin.designprincipals.adapter.mosh.filters;

import me.tuhin.designprincipals.adapter.mosh.Image;

public class Caramel {
    public void init() {
        System.out.println("Init Caramel");
    }

    public void render(Image image) {
        System.out.println("Applying caramel Filter...");
    }
}
