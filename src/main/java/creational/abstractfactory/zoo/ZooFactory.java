package creational.abstractfactory.zoo;

import creational.abstractfactory.AnimalFactory;
import creational.abstractfactory.Bird;
import creational.abstractfactory.Mammals;
import creational.abstractfactory.Person;

public class ZooFactory implements AnimalFactory {

    @Override
    public Person getPerson() {
        return new Keeper();
    }

    @Override
    public Mammals getMammals() {
        return new Lion();
    }

    @Override
    public Bird getBird() {
        return new Ostrich();
    }
}
