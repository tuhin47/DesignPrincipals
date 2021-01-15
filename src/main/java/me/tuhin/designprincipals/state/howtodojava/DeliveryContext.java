package me.tuhin.designprincipals.state.howtodojava;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeliveryContext {

    private PackageState currentState;
    private String packageId;

    public DeliveryContext(PackageState currentState, String packageId) {
        super();
        this.currentState = currentState;
        this.packageId = packageId;

        if (currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }

    public void update() {
        currentState.updateState(this);
    }
}
