package creational.builder;

public class Phone {

    private String manufacturer;
    private String name;
    private int price;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
