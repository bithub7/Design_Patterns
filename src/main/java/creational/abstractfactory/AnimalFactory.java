package creational.abstractfactory;

public interface AnimalFactory {
    Person getPerson();
    Mammals getMammals();
    Bird getBird();
}
