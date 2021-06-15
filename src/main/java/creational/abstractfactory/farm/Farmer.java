package creational.abstractfactory.farm;

import creational.abstractfactory.Person;

public class Farmer implements Person {

    @Override
    public void lookAnimals(){
        System.out.println("I am a farmer. I look after pets");
    }
}
