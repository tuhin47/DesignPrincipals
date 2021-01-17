package me.tuhin.designprincipals.template.exercise;

public class ToolWindow extends Window{
    @Override
    protected void doBeforeClose() {
        System.out.println("Before closing Tool window");
    }

    @Override
    protected void doAfterClose() {
        System.out.println("After closing Tool window");
    }
}
