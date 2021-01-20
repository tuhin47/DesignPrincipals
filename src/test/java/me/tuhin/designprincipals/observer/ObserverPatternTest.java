package me.tuhin.designprincipals.observer;

import lombok.var;
import me.tuhin.designprincipals.observer.mosh.Chart;
import me.tuhin.designprincipals.observer.mosh.DataSource;
import me.tuhin.designprincipals.observer.mosh.Sheet;
import org.junit.jupiter.api.Test;

class ObserverPatternTest {
    @Test
    void observerPatternMosh() {
        var dataSource = new DataSource();
        var sheet1 = new Sheet(dataSource);
        var sheet2 = new Sheet(dataSource);
        var chart = new Chart(dataSource);
        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);
        dataSource.setValue(69);
    }
}
