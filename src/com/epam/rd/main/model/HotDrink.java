package com.epam.rd.main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HotDrink extends Drink {

    private int temperature;

    @Override
    public void currentItems() {
        super.currentItems();
    }

    @Override
    public void reStock() {
        super.reStock();
    }
}

