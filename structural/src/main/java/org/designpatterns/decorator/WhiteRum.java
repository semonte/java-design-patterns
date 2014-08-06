package org.designpatterns.decorator;

import java.math.BigDecimal;

public class WhiteRum extends CocktailDecorator {

    public WhiteRum(Cocktail cocktail) {
        super(cocktail);
    }

    public BigDecimal getCost() {
        return cocktail.getCost().add(new BigDecimal(3));
    }

    public String getDescription() {
        return cocktail.getDescription() + ", White rum";
    }
}
