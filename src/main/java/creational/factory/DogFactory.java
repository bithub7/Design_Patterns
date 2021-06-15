package creational.factory;

public class DogFactory implements AnimalFactory {

    @Override
    public Dog createAnimals(){
        return new Dog();
    }
}
