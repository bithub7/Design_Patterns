package creational.builder;

public abstract class PhoneBuilder{
    Phone phone;

    void createPhone(){
        phone = new Phone();
    }

    abstract void buildManufacturer();
    abstract void buildModel();
    abstract void buildPrice();

    Phone getPhone(){
        return phone;
    }
}
