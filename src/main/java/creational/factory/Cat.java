package creational.factory;

public class Cat implements Animal {
    @Override
    public void tell(){
        System.out.println("Кот говорит \"Мьяу\"");
    }
}
