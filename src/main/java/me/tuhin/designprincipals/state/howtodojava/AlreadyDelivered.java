package me.tuhin.designprincipals.state.howtodojava;


public class AlreadyDelivered implements PackageState {

    private static AlreadyDelivered instance = new AlreadyDelivered();

    private AlreadyDelivered() {
    }

    public static AlreadyDelivered getInstance() {
        return instance;
    }

    @Override
    public void updateState(DeliveryContext ctx) {
        System.out.println(ctx.getPackageId() + " Package is already Delivered!!");
    }
}
