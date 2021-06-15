package behavioral.strategy;

public class DeveloperRunner {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.justDoIt();

        developer.setActivity(new Training());
        developer.justDoIt();

        developer.setActivity(new Coding());
        developer.justDoIt();

        developer.setActivity(new Reading());
        developer.justDoIt();

        developer.setActivity(new Sleeping());
        developer.justDoIt();

    }

}
