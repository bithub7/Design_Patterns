package creational.singelton;

public class Main {
    public static void main(String[] args) {
        Display display = Display.getDisplay();

        display.changeDisplayСontent("Shows a movie");
        System.out.println("Display Сontent "+display.getDisplayСontent());
        display.changeDisplayСontent("Shows cartoon");
        System.out.println("Display Сontent "+display.getDisplayСontent());
        display.changeDisplayСontent("Shows nothing");
        System.out.println("Display Сontent "+display.getDisplayСontent());

        System.out.println();
        System.out.println("hasCode: " + Display.getDisplay().hashCode());
        System.out.println("hasCode: " + Display.getDisplay().hashCode());
        System.out.println("hasCode: " + Display.getDisplay().hashCode());
        System.out.println("hasCode: " + Display.getDisplay().hashCode());
        System.out.println("hasCode: " + Display.getDisplay().hashCode());
        System.out.println("hasCode: " + Display.getDisplay().hashCode());



    }
}
