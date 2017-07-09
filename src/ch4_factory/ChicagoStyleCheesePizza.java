package ch4_factory;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Sharedded Mozzarella Cherese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
