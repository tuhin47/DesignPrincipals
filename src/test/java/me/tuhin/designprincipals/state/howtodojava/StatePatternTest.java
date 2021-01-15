package me.tuhin.designprincipals.state.howtodojava;

import org.junit.jupiter.api.Test;

class StatePatternTest {
    @Test
    void statePattern() {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }

}
