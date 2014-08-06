package org.designpatterns.decorator;

import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.Assert.assertEquals;

public class CocktailTest {

    @Test
    public void thatCocktailIsDecorated() {

        Cocktail cocktail = new BasicCocktail();
        assertEquals("Vodka", cocktail.getDescription());

        cocktail = new WhiteRum(cocktail);
        assertEquals("Vodka, White rum", cocktail.getDescription());

        cocktail = new TripleSec(cocktail);
        assertEquals("Vodka, White rum, Triple sec", cocktail.getDescription());

        cocktail = new Tequila(cocktail);
        assertEquals("Vodka, White rum, Triple sec, Tequila", cocktail.getDescription());

        cocktail = new LemonJuice(cocktail);
        assertEquals("Vodka, White rum, Triple sec, Tequila, Lemon juice", cocktail.getDescription());

        cocktail = new Gin(cocktail);
        assertEquals("Vodka, White rum, Triple sec, Tequila, Lemon juice, Gin", cocktail.getDescription());

        cocktail = new Cola(cocktail);
        assertEquals("Vodka, White rum, Triple sec, Tequila, Lemon juice, Gin, Cola", cocktail.getDescription());

        assertEquals(new BigDecimal(18), cocktail.getCost());
    }
}
