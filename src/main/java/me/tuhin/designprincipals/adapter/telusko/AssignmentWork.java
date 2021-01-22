package me.tuhin.designprincipals.adapter.telusko;

public class AssignmentWork {
    private final Pen pen;

    public AssignmentWork(Pen pen) {
        this.pen = pen;
    }

    public void writeAssignment(String string) {
        pen.write(string);
    }
}
