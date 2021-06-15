package creational.abstractfactory.zoo;

import creational.abstractfactory.Bird;

public class Ostrich implements Bird {

    @Override
    public void cleansFeathers(){
        System.out.println("I am a ostrich. I am brush feathers ");
    }

}
