package org.designpatterns.decorator;

import java.math.BigDecimal;

public class CocktailDecorator extends Cocktail {

    protected final Cocktail cocktail;

    public CocktailDecorator(Cocktail cocktail) {
        this.cocktail = cocktail;
    }

    public BigDecimal getCost() {
        return cocktail.getCost();
    }

    public String getDescription() {
        return cocktail.getDescription();
    }
}
