package creational.abstractfactory.farm;

import creational.abstractfactory.Bird;

public class Hen implements Bird {
    @Override
    public void cleansFeathers() {

        System.out.println("I am a hen. I am cleans feathers");

    }
}
