package creational.builder;

public class Director {
    PhoneBuilder builder;

    public void setBuilder(PhoneBuilder builder)  {
        this.builder = builder;
    }

    Phone buildPhone(){

        builder.createPhone();
        builder.buildManufacturer();
        builder.buildModel();
        builder.buildPrice();

        Phone phone = builder.getPhone();

        return phone;
    }
}
