package creational.abstractfactory;

import creational.abstractfactory.farm.FarmFactory;

public class CreateFarm {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new FarmFactory();
        Person person = animalFactory.getPerson();
        Mammals mammals = animalFactory.getMammals();
        Bird bird = animalFactory.getBird();

        System.out.println("Creating farm...");

        person.lookAnimals();
        mammals.drinkingMilk();
        bird.cleansFeathers();
    }
}
