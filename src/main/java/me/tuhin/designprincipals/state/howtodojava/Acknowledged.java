package me.tuhin.designprincipals.state.howtodojava;

public class Acknowledged implements PackageState {
    //Singleton
    private static final Acknowledged instance = new Acknowledged();

    private Acknowledged() {
    }

    public static Acknowledged instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}
