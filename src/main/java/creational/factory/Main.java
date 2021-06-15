package creational.factory;

public class Main {
    public static void main(String[] args) {

        AnimalFactory animalFactory = createAnimalByName("cat");

        Animal animal = animalFactory.createAnimals();

        animal.tell();

    }

    static AnimalFactory createAnimalByName(String animalName){
        if(animalName.equalsIgnoreCase("cat")) {
            return new CatFactory();
        } else if(animalName.equalsIgnoreCase("dog")){
            return new DogFactory();
        } else if (animalName.equalsIgnoreCase("cow")){
            return new CowFactory();
        } else{
            throw new RuntimeException(animalName + " is unknow animals");
        }
    }
}
