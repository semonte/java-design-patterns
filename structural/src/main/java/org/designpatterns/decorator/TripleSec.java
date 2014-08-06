package org.designpatterns.decorator;

import java.math.BigDecimal;

public class TripleSec extends CocktailDecorator {

    public TripleSec(Cocktail cocktail) {
        super(cocktail);
    }

    public BigDecimal getCost() {
        return cocktail.getCost().add(new BigDecimal(3));
    }

    public String getDescription() {
        return cocktail.getDescription() + ", Triple sec";
    }
}
