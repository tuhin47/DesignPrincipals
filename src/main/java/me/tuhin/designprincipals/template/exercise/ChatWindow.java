package me.tuhin.designprincipals.template.exercise;

public class ChatWindow extends Window{

    @Override
    protected void doBeforeClose() {
        System.out.println("Chat window will close");
    }

    @Override
    protected void doAfterClose() {
        System.out.println("Chat window is closed");
    }
}
