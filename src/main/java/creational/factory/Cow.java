package creational.factory;

public class Cow implements Animal {
    @Override
    public void tell(){
        System.out.println("Корова говорит \"Му\"");
    }
}
