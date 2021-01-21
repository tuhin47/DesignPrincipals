package me.tuhin.designprincipals.observer.howtodoinjava;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOne :: " + m.getMessageContent());
    }
}
