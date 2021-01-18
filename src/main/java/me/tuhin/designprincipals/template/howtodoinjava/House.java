package me.tuhin.designprincipals.template.howtodoinjava;

public abstract class House {
    /**
     * This is the template method we are discussing. This method should be
     * final so that other class can't re-implement and change the order of the
     * steps.
     */
    public final void buildhouse() {
        constructBase();
        constructRoof();
        constructWalls();
        constructWindows();
        constructDoors();
        paintHouse();
        decorateHouse();
    }


    protected abstract void decorateHouse();

    protected abstract void paintHouse();

    protected abstract void constructDoors();

    protected abstract void constructWindows();

    protected abstract void constructWalls();

    /**
     * final implementation of constructing roof - final as all type of house
     * Should build roof in same manner.
     */
    private final void constructRoof() {
        System.out.println("Roof has been constructed.");
    }

    /**
     * final implementation of constructing base - final as all type of house
     * Should build base/foundation in same manner.
     */
    private final void constructBase() {
        System.out.println("Base has been constructed.");
    }
}
