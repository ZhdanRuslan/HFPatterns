package ch4_factory;

import ch4_factory.entities.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Etan ordered a " + pizza.getName() + "\n");
    }
}
