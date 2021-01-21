package me.tuhin.designprincipals.observer;

import lombok.var;
import me.tuhin.designprincipals.observer.exercise.StatusBar;
import me.tuhin.designprincipals.observer.exercise.Stock;
import me.tuhin.designprincipals.observer.exercise.StockListView;
import me.tuhin.designprincipals.observer.howtodoinjava.*;
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

    @Test
    void observerPatternMoshExercise() {

        var stock01 = new Stock("$", 23);
        var stock02 = new Stock("swe", 33);
        var stock03 = new Stock("stock3", 44);

        var statusBar = new StatusBar();
        var stockList = new StockListView();

        statusBar.addStock(stock01);
        statusBar.addStock(stock02);
        statusBar.addStock(stock03);

        stockList.addStock(stock01);
        stockList.addStock(stock03);

        stock03.addObserver(statusBar);
        stock03.addObserver(stockList);
        stock01.addObserver(statusBar);
        stock01.addObserver(stockList);

        stock01.setPrice(123);
        stock03.setPrice(140);
    }

    @Test
    void observerPatternHowToDoInJava() {

        //push style
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);
        p.attach(s2);

        p.notifyUpdate(new Message("First Message"));   //s1 and s2 will receive the update

        p.detach(s1);
        p.attach(s3);

        p.notifyUpdate(new Message("Second Message")); //s2 and s3 will receive the update
    }
}
