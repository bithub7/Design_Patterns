package creational.abstractfactory.farm;

import creational.abstractfactory.AnimalFactory;
import creational.abstractfactory.Bird;
import creational.abstractfactory.Mammals;
import creational.abstractfactory.Person;

public class FarmFactory implements AnimalFactory {

    @Override
    public Person getPerson() {
        return new Farmer();
    }

    @Override
    public Mammals getMammals() {
        return new Dog();
    }

    @Override
    public Bird getBird() {
        return new Hen();
    }
}
