package me.tuhin.designprincipals.state.howtodojava;

public class Delivered implements PackageState {
    //Singleton
    private static final Delivered instance = new Delivered();

    private Delivered() {
    }

    public static Delivered instance() {
        return instance;
    }

    //Business logic
    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println("Package is delivered!!");
        ctx.setCurrentState(AlreadyDelivered.getInstance());
    }
}
