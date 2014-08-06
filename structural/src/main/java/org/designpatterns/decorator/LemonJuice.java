package org.designpatterns.decorator;

import java.math.BigDecimal;

public class LemonJuice extends CocktailDecorator {

    public LemonJuice(Cocktail cocktail) {
        super(cocktail);
    }

    public BigDecimal getCost() {
        return cocktail.getCost().add(new BigDecimal(1));
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Lemon juice";
    }
}

