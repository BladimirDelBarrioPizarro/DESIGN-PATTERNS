package com.patterns.design.behavioural.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BuyStock implements Order{

    private Stock stock;

    @Override
    public void execute() {
        stock.buy();
    }
}
