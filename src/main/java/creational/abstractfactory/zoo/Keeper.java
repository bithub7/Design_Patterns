package creational.abstractfactory.zoo;

import creational.abstractfactory.Person;

public class Keeper implements Person {

    @Override
    public void lookAnimals(){
        System.out.println("I am a keeper. I am look after exotic animals ");
    }

}
