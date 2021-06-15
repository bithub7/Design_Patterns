package creational.factory;

public class CowFactory implements AnimalFactory {

    @Override
    public Cow createAnimals(){
        return new Cow();
    }
}
