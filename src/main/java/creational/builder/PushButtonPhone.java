package creational.builder;

public class PushButtonPhone extends PhoneBuilder{

    @Override
    void buildManufacturer(){
        phone.setManufacturer("Nokia");
    }
    @Override
    void buildModel(){
        phone.setModel("3310");
    }
    @Override
    void buildPrice(){
        phone.setPrice(50);
    }
}
