package creational.abstractfactory;

import creational.abstractfactory.zoo.ZooFactory;

public class  CreateZoo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new ZooFactory();
        Person person = animalFactory.getPerson();
        Mammals mammals = animalFactory.getMammals();
        Bird bird = animalFactory.getBird();

        System.out.println("Creating zoo...");

        person.lookAnimals();
        mammals.drinkingMilk();
        bird.cleansFeathers();
    }
}
