package org.designpatterns.decorator;

import java.math.BigDecimal;

public class BasicCocktail extends Cocktail {

    public BigDecimal getCost() {
        return new BigDecimal(3);
    }

    public String getDescription() {
        return "Vodka";
    }
}
