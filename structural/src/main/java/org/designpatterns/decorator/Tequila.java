package org.designpatterns.decorator;

import java.math.BigDecimal;

public class Tequila extends CocktailDecorator {

    public Tequila(Cocktail cocktail) {
        super(cocktail);
    }

    public BigDecimal getCost() {
        return cocktail.getCost().add(new BigDecimal(3));
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Tequila";
    }
}
