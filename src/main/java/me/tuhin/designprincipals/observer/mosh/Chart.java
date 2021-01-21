package me.tuhin.designprincipals.observer.mosh;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Chart implements Observer {
    //Pull style
    private final DataSource dataSource;
    @Override
    public void update() {
        System.out.println("Chart updated " + dataSource.getValue());
    }
}
