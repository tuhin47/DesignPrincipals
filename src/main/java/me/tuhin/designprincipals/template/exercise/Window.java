package me.tuhin.designprincipals.template.exercise;

public abstract class Window {

    public void close() {
        doBeforeClose();
        System.out.println("Closing method called");
        doAfterClose();
    }

    protected abstract void doBeforeClose();

    protected abstract void doAfterClose();
}
