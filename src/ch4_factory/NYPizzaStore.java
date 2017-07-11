package ch4_factory;

import ch4_factory.entities.*;
import ch4_factory.factory.NYPizzaIngredientFactory;
import ch4_factory.factory.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style cheese pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style veggie pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style clam pizza");
        } else if (item.equals("paperonni")) {
            pizza = new PepperoniPiza(ingredientFactory);
            pizza.setName("NY Style pepperoni pizza");
        }
        return pizza;
    }
}
