package creational.abstractfactory.farm;

import creational.abstractfactory.Mammals;

public class Dog implements Mammals {
    @Override
    public void drinkingMilk() {
        System.out.println("I am a dog. I am drinking milk");

    }
}
