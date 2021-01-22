package me.tuhin.designprincipals.adapter.telusko;

import me.tuhin.designprincipals.adapter.telusko.pens.PilotPen;

public class PenAdapter implements Pen {
    PilotPen pilotPen = new PilotPen();

    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
