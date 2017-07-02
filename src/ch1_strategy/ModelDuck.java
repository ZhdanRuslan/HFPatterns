package ch1_strategy;

import ch1_strategy.flybehavior.FlyNoWay;
import ch1_strategy.quackbehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
