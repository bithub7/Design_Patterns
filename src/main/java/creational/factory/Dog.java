package creational.factory;

public class Dog implements Animal {
    @Override
    public void tell(){
        System.out.println("Собака говорит \"Гав\"");
    }
}
