package creational.abstractfactory.zoo;

import creational.abstractfactory.Mammals;

public class Lion implements Mammals {

    @Override
    public void drinkingMilk(){
        System.out.println("I am a lion. I am drinking milk");
    }
}
