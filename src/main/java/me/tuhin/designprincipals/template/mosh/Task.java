package me.tuhin.designprincipals.template.mosh;

public abstract class Task {
    private final AuditTrail auditTrail = new AuditTrail();

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
