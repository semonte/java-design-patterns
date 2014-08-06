package org.designpatterns.decorator;

import java.math.BigDecimal;

public abstract class Cocktail {
    public abstract BigDecimal getCost();

    public abstract String getDescription();
}
