package creational.factory;

public class CatFactory implements AnimalFactory {

    @Override
    public Cat createAnimals(){
        return new Cat();
    }
}
