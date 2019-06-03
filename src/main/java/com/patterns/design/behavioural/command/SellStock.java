package com.patterns.design.behavioural.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SellStock implements Order {

    private Stock stock;

    @Override
    public void execute() {
        stock.sell();
    }
}
