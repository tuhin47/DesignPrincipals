package me.tuhin.designprincipals.observer.mosh;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class Sheet implements Observer {
    private final DataSource dataSource;

    @Override
    public void update() {
        System.out.println("Sheet updated " + dataSource.getValue());
    }
}
