package ch4_factory;

public class PepperoniPiza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    PepperoniPiza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
