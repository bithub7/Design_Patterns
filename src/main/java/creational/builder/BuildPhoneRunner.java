package creational.builder;

public class BuildPhoneRunner {
    public static void main(String[] args) {

        Director director = new Director();

        director.setBuilder(new PushButtonPhone());

        Phone phone = director.buildPhone();

        System.out.println(phone);
    }
}
