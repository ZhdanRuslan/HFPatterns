package ch4_factory.entities;

import ch4_factory.factory.PizzaIngredientFactory;

public class PepperoniPiza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPiza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
