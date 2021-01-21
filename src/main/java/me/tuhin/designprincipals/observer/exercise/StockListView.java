package me.tuhin.designprincipals.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private final List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("StockList::");
        show();
    }

    private void show() {
        stocks.forEach(System.out::println);
    }
}
