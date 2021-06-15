package creational.builder;

public class SmartPhone extends PhoneBuilder {

    @Override
    void buildManufacturer(){
        phone.setManufacturer("Apple");
    }
    @Override
    void buildModel(){
        phone.setModel("X");
    }
    @Override
    void buildPrice(){
        phone.setPrice(800);
    }
}
