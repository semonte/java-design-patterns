package org.designpatterns.decorator;

import java.math.BigDecimal;

public class Cola extends CocktailDecorator {

    public Cola(Cocktail cocktail) {
        super(cocktail);
    }

    public BigDecimal getCost() {
        return cocktail.getCost().add(new BigDecimal(2));
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Cola";
    }
}
