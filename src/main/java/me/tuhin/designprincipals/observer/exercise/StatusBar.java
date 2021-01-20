package me.tuhin.designprincipals.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {

    private final List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void removeStock(Stock stock) {
        stocks.remove(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("STATUS BAR::");
        show();
    }

    private void show() {
        for (Stock stock : stocks) {
            System.out.println(stock);
        }
    }
}
